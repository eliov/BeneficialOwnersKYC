package com.beneficialowners.service.impl;

import com.beneficialowners.model.BeneficialOwner;
import com.beneficialowners.repository.BeneficialOwnerRepository;
import com.beneficialowners.service.BeneficialOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficialOwnerServiceImpl implements BeneficialOwnerService {

    @Autowired
    private BeneficialOwnerRepository beneficialOwnerRepository;

    @Override
    public List<BeneficialOwner> findByRegCode(String regCode) {
        return beneficialOwnerRepository.findAllByLegalEntityRegCode(regCode);
    }

    @Override
    public List<BeneficialOwner> filterBeneficial(String name, String surname, String birthDate) {
    return beneficialOwnerRepository.findAllByForenameAndSurname(name,surname);
    }


}
