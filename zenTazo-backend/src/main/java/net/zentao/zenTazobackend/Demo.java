package net.zentao.zenTazobackend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "demo")
public class Demo {

    @Id
    private int id;

    private String name;

    private String sname;

    public Demo(){

    }

    public Demo(int id,String name,String sname){

        this.id = id;
        this.name = name;
        this.sname = sname;


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

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


}
