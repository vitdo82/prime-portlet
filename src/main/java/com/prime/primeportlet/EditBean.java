package com.prime.primeportlet;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import com.prime.primeportlet.model.AgencyUser;

@ViewScoped
@ManagedBean(name = "editBean")
public class EditBean implements Serializable {

	private static final long serialVersionUID = -7705706268909440728L;

	private AgencyUser agencyUser;

	@ManagedProperty(value = "#{sessionBean}")
	private SessionBean sessionBean;

	public EditBean() {
	}

	@PostConstruct
	public void init() {
		agencyUser = new AgencyUser();
	}

	public AgencyUser getAgencyUser() {
		return agencyUser;
	}

	public String saveAction() {
		agencyUser.setId(System.currentTimeMillis());
		sessionBean.getAgencyUsers().add(agencyUser);
		sessionBean.setPage("list");
		return null;
	}

	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public void saveActionListener(ActionEvent event) {
		agencyUser.setId(System.currentTimeMillis());
		sessionBean.getAgencyUsers().add(agencyUser);
	}

    public void navigateEditAction(Long id){
        for(AgencyUser agencyUser : sessionBean.getAgencyUsers()){
            if (agencyUser.getId().equals(id)) {
               this.agencyUser = agencyUser;
                sessionBean.setPage("edit");
                return ;
            }
        }
        this.agencyUser = new AgencyUser();
        sessionBean.setPage("edit");
    }

	public String createViewAction() {
		return "edit";
	}
}
