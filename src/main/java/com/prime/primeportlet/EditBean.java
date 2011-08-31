package com.prime.primeportlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "editBean")
@ViewScoped
public class EditBean implements Serializable {

    private static final long serialVersionUID = -7705706268909440728L;

    private AgencyUser agencyUser;

    public EditBean() {
    }

    public AgencyUser getAgencyUser() {
        return agencyUser;
    }
}
