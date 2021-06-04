package com.beneficialowners.service;

import com.beneficialowners.model.BeneficialOwner;

import java.util.List;

public interface BeneficialOwnerService {

    List<BeneficialOwner> findByRegCode(String regCode);
    List<BeneficialOwner> filterBeneficial(String name,String surname,String birthDate);

}
