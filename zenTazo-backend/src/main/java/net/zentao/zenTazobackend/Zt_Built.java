package net.zentao.zenTazobackend;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "zt_build")
public class Zt_Built {


    //int variables
    @Id
    @GeneratedValue
    private int id;
    private int product;
    private int branch;
    private int project;


    //String variables
    private String name;
    private String scmPath;
    private String filePath;
    private String stories;
    private String bugs;
    private String builder;

    //Date variables
    private Date date;

    //Boolean
    private boolean deleted;


    public Zt_Built(int id, int product, int branch, int project, boolean deleted, String name, String scmPath,
                    String filePath, String stories, String bugs, String builder, Date date){

        this.id = id;
        this.product = product;
        this.branch = branch;
        this.project = project;
        this.deleted = deleted;
        this.name  = name;
        this.scmPath = scmPath;
        this.filePath = filePath;
        this.stories = stories;
        this.bugs = bugs;
        this.builder = builder;
        this.date = date;
    }

    public Zt_Built() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScmPath() {
        return scmPath;
    }

    public void setScmPath(String scmPath) {
        this.scmPath = scmPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public String getBugs() {
        return bugs;
    }

    public void setBugs(String bugs) {
        this.bugs = bugs;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    @Override
    public String toString() {
        return "Zt_Built{" +
                "id=" + id +
                ", product=" + product +
                ", branch=" + branch +
                ", project=" + project +
                ", deleted=" + deleted +
                ", name='" + name + '\'' +
                ", scmPath='" + scmPath + '\'' +
                ", filePath='" + filePath + '\'' +
                ", date=" + date +
                ", stories='" + stories + '\'' +
                ", bugs='" + bugs + '\'' +
                ", builder='" + builder + '\'' +
                '}';
    }
}
