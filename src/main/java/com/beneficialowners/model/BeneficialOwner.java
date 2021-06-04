package com.beneficialowners.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class BeneficialOwner {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name="legal_entity_registration_number")
    private LegalEntity legalEntity;


    private String forename;
    private String surname;
    private String latvianIdentityNumber;
    private String birthdate;
    private String nationality;
    private String residence;
    private String registeredOn;
    private String lastModifiedAt;






    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(LegalEntity legalEntity) {
        this.legalEntity = legalEntity;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLatvianIdentityNumber() {
        return latvianIdentityNumber;
    }

    public void setLatvianIdentityNumber(String latvianIdentityNumber) {
        this.latvianIdentityNumber = latvianIdentityNumber;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }


    public String getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(String registeredOn) {
        this.registeredOn = registeredOn;
    }

    public String getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }
}
