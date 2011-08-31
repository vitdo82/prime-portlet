package com.prime.primeportlet;

import java.io.Serializable;
import java.util.Date;

public class AgencyUser implements Serializable {

    private static final long serialVersionUID = 6934510931062333069L;

    private String lastName;

    private String firstName;

    private String title;

    private Date effective;

    private Date expiration;

    public AgencyUser() {
    }

    public AgencyUser(String lastName, String firstName, String title) {
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
}
