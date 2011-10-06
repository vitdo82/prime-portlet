package com.prime.primeportlet;

import com.prime.primeportlet.model.AgencyUser;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ViewScoped
@ManagedBean(name = "viewBean")
public class ViewBean implements Serializable {

    private static final long serialVersionUID = -7705706268909440728L;

    private AgencyUser agencyUser;

    @ManagedProperty(value = "#{sessionBean}")
    private SessionBean sessionBean;

    public ViewBean() {
    }

    @PostConstruct
    public void init(){
        agencyUser = new AgencyUser();
    }

    public AgencyUser getAgencyUser() {
        return agencyUser;
    }

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    public void navigateViewAction(Long id){
        for(AgencyUser agencyUser : sessionBean.getAgencyUsers()){
            if(agencyUser.getId().equals(id)){
                this.agencyUser = agencyUser;
                sessionBean.setPage("view");
                return ;
            }
        }
        this.agencyUser = new AgencyUser();
        sessionBean.setPage("view");
    }
}
