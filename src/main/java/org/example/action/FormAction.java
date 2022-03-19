package org.example.action;

import javax.lang.model.element.NestingKind;

public class FormAction {
    public String username;
    public String telephone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public  String a(){
        System.out.println(this.username+"\t"+this.telephone);
        return null;
    }
}
