package com.prime.primeportlet.model;

import java.io.Serializable;
import java.util.Date;

public class AgencyUser implements Serializable {

    private static final long serialVersionUID = 6934510931062333069L;

    private Long id;
    private String lastName;
    private String firstName;
    private String mi;
    private String suffix;
    private String title;
    private String email;
    private String telephone;
    private String extension;
    private boolean licensed;
    private String userRole;
    private String agencyProfile;

    private Date effective;
    private Date expiration;

    public AgencyUser() {
    }

    public AgencyUser(Long id, String lastName, String firstName, String title) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEffective() {
        return effective;
    }

    public void setEffective(Date effective) {
        this.effective = effective;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public boolean isLicensed() {
        return licensed;
    }

    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getAgencyProfile() {
        return agencyProfile;
    }

    public void setAgencyProfile(String agencyProfile) {
        this.agencyProfile = agencyProfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
