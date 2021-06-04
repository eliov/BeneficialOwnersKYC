package com.beneficialowners.controller;

import com.beneficialowners.model.BeneficialOwner;
import com.beneficialowners.model.LegalEntity;
import com.beneficialowners.repository.BeneficialOwnerRepository;
import com.beneficialowners.repository.LegalEntityRepository;
import com.beneficialowners.service.BeneficialOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeneficialOwnerController {

    @Autowired
    private BeneficialOwnerService beneficialOwnerService;

    @GetMapping("/get/{regCode}")
    public ResponseEntity<List<BeneficialOwner>> get(@PathVariable("regCode") String regCode) {

        List<BeneficialOwner> allByLegalEntity = beneficialOwnerService.findByRegCode(regCode);
        return new ResponseEntity<List<BeneficialOwner>>(allByLegalEntity, HttpStatus.OK);
    }

    @GetMapping("/search/{name}/{surname}/{birthDate}")
    public ResponseEntity<List<BeneficialOwner>> search(@PathVariable String name,@PathVariable String surname, @PathVariable String birthDate) {

        List<BeneficialOwner> allByLegalEntity = beneficialOwnerService.filterBeneficial(name,surname,birthDate);
        return new ResponseEntity<List<BeneficialOwner>>(allByLegalEntity, HttpStatus.OK);
    }


}
