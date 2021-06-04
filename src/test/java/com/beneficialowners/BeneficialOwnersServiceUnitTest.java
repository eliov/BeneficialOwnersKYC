package com.beneficialowners;

import com.beneficialowners.model.BeneficialOwner;
import com.beneficialowners.model.LegalEntity;
import com.beneficialowners.repository.BeneficialOwnerRepository;
import com.beneficialowners.service.BeneficialOwnerService;
import com.beneficialowners.service.impl.BeneficialOwnerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class BeneficialOwnersServiceUnitTest {

	private final String REGISTRATION_CODE = "40008223126";

	@Mock
	private BeneficialOwnerRepository beneficialOwnerRepository;

	@InjectMocks
	private BeneficialOwnerService beneficialOwnerService = new BeneficialOwnerServiceImpl();

	@BeforeEach
	void setMockOutput() {
		LegalEntity legalEntity = new LegalEntity();
		legalEntity.setName(REGISTRATION_CODE);
		legalEntity.setName("Test company");

		BeneficialOwner beneficialOwner = new BeneficialOwner();
		beneficialOwner.setId(1);
		beneficialOwner.setForename("Test");
		beneficialOwner.setLegalEntity(legalEntity);

		when(beneficialOwnerRepository.findAllByLegalEntityRegCode(anyString())).thenReturn(Arrays.asList(beneficialOwner));
	}


	@Test
	void entityIsNotNull() {
		assertNotNull(beneficialOwnerService.findByRegCode(REGISTRATION_CODE));
	}

	@Test
	void legalEntityIdIsGreaterThanZero() {
		List<BeneficialOwner> beneficialOwnerList = beneficialOwnerService.findByRegCode(REGISTRATION_CODE);
		assertEquals(1, beneficialOwnerList.size());

		BeneficialOwner beneficialOwner = beneficialOwnerList.get(0);
		assertEquals(1, beneficialOwner.getId());
	}


}
