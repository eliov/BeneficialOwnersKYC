package com.beneficialowners.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class LegalEntity {

    @Id
    private String regCode;
    private String sepa;
    private String name;
    private String nameBeforeQuotes;
    private String nameInQuotes;
    private String nameAfterQuotes;
    private String withoutQuotes;
    private String regType;
    private String regtypeText;
    private String type;
    private String typeText;
    private String registered;
    private String terminated;
    private String closed;
    private String address;
    private String index;
    private String addressId;
    private String region;
    private String city;
    private String atvk;
    private String registrationTerm;

    @OneToMany
    @JsonIgnore
    private List<BeneficialOwner> beneficialOwners;

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getSepa() {
        return sepa;
    }

    public void setSepa(String sepa) {
        this.sepa = sepa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameBeforeQuotes() {
        return nameBeforeQuotes;
    }

    public void setNameBeforeQuotes(String nameBeforeQuotes) {
        this.nameBeforeQuotes = nameBeforeQuotes;
    }

    public String getNameInQuotes() {
        return nameInQuotes;
    }

    public void setNameInQuotes(String nameInQuotes) {
        this.nameInQuotes = nameInQuotes;
    }

    public String getNameAfterQuotes() {
        return nameAfterQuotes;
    }

    public void setNameAfterQuotes(String nameAfterQuotes) {
        this.nameAfterQuotes = nameAfterQuotes;
    }

    public String getWithoutQuotes() {
        return withoutQuotes;
    }

    public void setWithoutQuotes(String withoutQuotes) {
        this.withoutQuotes = withoutQuotes;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getRegtypeText() {
        return regtypeText;
    }

    public void setRegtypeText(String regtypeText) {
        this.regtypeText = regtypeText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeText() {
        return typeText;
    }

    public void setTypeText(String typeText) {
        this.typeText = typeText;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public String getTerminated() {
        return terminated;
    }

    public void setTerminated(String terminated) {
        this.terminated = terminated;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAtvk() {
        return atvk;
    }

    public void setAtvk(String atvk) {
        this.atvk = atvk;
    }

    public String getRegistrationTerm() {
        return registrationTerm;
    }

    public void setRegistrationTerm(String registrationTerm) {
        this.registrationTerm = registrationTerm;
    }

    public List<BeneficialOwner> getBeneficialOwners() {
        return beneficialOwners;
    }

    public void setBeneficialOwners(List<BeneficialOwner> beneficialOwners) {
        this.beneficialOwners = beneficialOwners;
    }
}
