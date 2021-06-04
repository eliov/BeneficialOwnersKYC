package com.beneficialowners.repository;

import com.beneficialowners.model.BeneficialOwner;
import com.beneficialowners.model.LegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeneficialOwnerRepository extends JpaRepository<BeneficialOwner,Long> {

    List<BeneficialOwner> findAllByLegalEntityRegCode(String regCode);
//    List<BeneficialOwner> findAllByBeneficialOwnerForeNameSurnameBirthdate(String name,String surname,String birthdate);
    List<BeneficialOwner> findAllByForenameAndSurname(String forename,String surname);
}
