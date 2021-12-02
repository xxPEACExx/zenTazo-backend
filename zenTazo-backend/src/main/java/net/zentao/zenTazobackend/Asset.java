package net.zentao.zenTazobackend;

import lombok.CustomLog;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.TemporalType;

import java.sql.Timestamp;
import java.util.Date;

@Entity (name = "zt_assett")
public class Asset {

    @Id
    private int id;

    private String name;

    private String status;

    private String type;

    private String group;

    private String createdby;

    private Timestamp createddate;

    private String editedby;

    private Timestamp editeddate;

    private char deleted;



    public Asset(int id, String name, String status, String type, String group,String createdby,String editedby, Timestamp createddate, Timestamp editeddate, char deleted){

        this.id = id;
        this.name = name;
        this.status = status;
        this.type = type;
        this.group = group;
        this.createddate = createddate;
        this.createdby = createdby;
        this.editedby = editedby;
        this.editeddate = editeddate;
        this.deleted = deleted;


    }
    public Asset(){


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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }



    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }


    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }


    public String getEditedby() {
        return editedby;
    }

    public void setEditedby(String editedby) {
        this.editedby = editedby;
    }

    public Timestamp getEditeddate() {
        return editeddate;
    }

    public void setEditeddate(Timestamp editeddate) {
        this.editeddate = editeddate;
    }

    public char getDeleted() {
        return deleted;
    }

    public void setDeleted(char deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", group='" + group + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createddate=" + createddate +
                ", editedby=" + editedby +
                ", editeddate=" + editeddate +
                ", deleted=" + deleted +
                '}';
    }
}
