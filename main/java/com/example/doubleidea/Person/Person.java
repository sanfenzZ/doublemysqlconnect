package com.example.doubleidea.Person;/*
 * Created by ZHANG on 2018/7/21
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private int name;

    public Person(){

    }
    public Person(int id,int name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
