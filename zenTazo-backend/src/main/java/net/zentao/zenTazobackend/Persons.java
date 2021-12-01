package net.zentao.zenTazobackend;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "persons")
public class Persons {

    @Id
    private int id;

    private String name;

    private String sureName;

    public Persons(int id,String name,String sureName){

        this.id = id;
        this.name = name;
        this.sureName = sureName;

    }

    public Persons(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
