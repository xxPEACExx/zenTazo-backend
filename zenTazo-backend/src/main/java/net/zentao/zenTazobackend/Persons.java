package net.zentao.zenTazobackend;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "persons")
public class Persons {

    @Id
    private int id;

    private String name;

    private String sureName;

    private String nationality;

    private int vaccination;



    public Persons(int id,String name,String sureName,String nationality,int vaccination){

        this.id = id;
        this.name = name;
        this.sureName = sureName;
        this.nationality = nationality;
        this.vaccination = vaccination;


    }

    public Persons(){

    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getVaccination() {
        return vaccination;
    }

    public void setVaccination(int vaccination) {
        this.vaccination = vaccination;
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
