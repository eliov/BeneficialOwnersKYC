package com.beneficialowners.repository;

import com.beneficialowners.model.LegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LegalEntityRepository extends JpaRepository<LegalEntity,String> {

    Optional<LegalEntity> findByRegCode(String regCode);

}
