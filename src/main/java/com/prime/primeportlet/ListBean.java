package com.prime.primeportlet;

import com.prime.primeportlet.model.AgencyUser;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@ManagedBean(name = "listBean")
public class ListBean implements Serializable {

    private static final long serialVersionUID = -7705706268909440728L;

    @ManagedProperty(value = "#{sessionBean}")
    private SessionBean sessionBean;

    public ListBean() {
    }

    @PostConstruct
    public void init(){
    }

    public List<AgencyUser> getAgencyUsers() {
        return sessionBean.getAgencyUsers();
    }

    public String viewAction(Long id){

        return "view";
    }

    public String editAction(Long id){

        return "edit";
    }

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }
}
