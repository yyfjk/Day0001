package org.example.action;

import java.util.*;

public class StudentAction {
    public Map  userMap;

    public Map getUserMap() {
        return userMap;
    }

    public void setUserMap(Map userMap) {
        this.userMap = userMap;
    }
    //给出一个集合的数据
    public Set<Map> lists=new HashSet<Map>();

    public Set<Map> getLists() {
        return lists;
    }

    public void setLists(Set<Map> lists) {
        this.lists = lists;
    }

    public String getData() {
        Map map1=new HashMap();
        map1.put("a","a1");
        map1.put("b","b1");
        Map map2=new HashMap();
        map2.put("a","a2");
        map2.put("b","b2");
        lists.add(map1);
        lists.add(map2);

        System.out.println(userMap);
        return "Student_getData";
    }
}
