package org.example.action;

import org.example.User;

import java.util.List;

public class MyForm3Action {
    public List<User> list;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }



    public String getData() {
        System.out.println(list);
        return null;
    }
}
