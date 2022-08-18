package com.lixiuchun.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionDemo implements Serializable{

    private List list;

    private Map map;

    private Object[] arr;

    private Properties properties;


    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionDemo{" +
                "list=" + list +
                ", map=" + map +
                ", arr=" + Arrays.toString(arr) +
                ", properties=" + properties +
                '}';
    }
}
