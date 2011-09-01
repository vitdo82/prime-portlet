package com.prime.primeportlet;


import com.prime.primeportlet.model.AgencyUser;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@ManagedBean(name = "sessionBean")
public class SessionBean implements Serializable {

    private static final long serialVersionUID = 7476941262307760323L;

    private List<AgencyUser> agencyUsers;

    public SessionBean() {
    }

    @PostConstruct
    protected void init() {
        getAgencyUsers().add(new AgencyUser(1L, "TestFirst", "TestLast", "Title"));
    }

    public List<AgencyUser> getAgencyUsers() {
        if (agencyUsers == null) {
            agencyUsers = new ArrayList<AgencyUser>();
        }
        return agencyUsers;
    }
}
