package org.example.action;

public class MyFormAction {
    public String username;
    public  String telephone;

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

    public  String getData(){
        //把数据获取出来
        System.out.println("username"+username+"\t"+"telephone"+telephone);
        return null;
    }
}
