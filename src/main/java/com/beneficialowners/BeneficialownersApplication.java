package com.beneficialowners;

import com.beneficialowners.model.BeneficialOwner;
import com.beneficialowners.model.LegalEntity;
import com.beneficialowners.repository.BeneficialOwnerRepository;
import com.beneficialowners.repository.LegalEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class BeneficialownersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeneficialownersApplication.class, args);
	}





}
