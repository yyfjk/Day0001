package org.example.action;

import java.util.Map;

public class MyForm2Action {
    public Map userMap;

    public Map getUserMap() {
        return userMap;
    }

    public void setUserMap(Map userMap) {
        this.userMap = userMap;
    }

    public  String getData(){
        System.out.println(userMap.toString());
        return null;
    }
}
