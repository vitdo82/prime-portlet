package com.prime.primeportlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(name = "test")
@ViewScoped
public class TestBean implements Serializable {

    private String html;

    private Date date;

    private List<AgencyUser> agencyUsers;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void editListener(ActionEvent actionEvent) {
        System.out.print("public void editListener(ActionEvent actionEvent){ " + actionEvent.toString());
    }

    public String fullAction() {
        System.out.print("public String fullAction(){");
        return "full";
    }

    public List<AgencyUser> getAgencyUsers() {
        if (agencyUsers == null) {
            agencyUsers = new ArrayList<AgencyUser>();
            agencyUsers.add(new AgencyUser("lastName1", "firstName1", "title1"));
            agencyUsers.add(new AgencyUser("lastName2", "firstName2", "title2"));
            agencyUsers.add(new AgencyUser("lastName3", "firstName3", "title3"));
            agencyUsers.add(new AgencyUser("lastName4", "firstName4", "title4"));
            agencyUsers.add(new AgencyUser("lastName5", "firstName5", "title5"));
        }
        return agencyUsers;
    }
}
