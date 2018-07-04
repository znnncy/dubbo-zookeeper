package com.jk.model;


import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

    private static final long serialVersionUID = -1800233088030401297L;
    private String id;

    private String name;

    private String pwd;

    private Date createdatetime;

    private Date modifydatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public Date getModifydatetime() {
        return modifydatetime;
    }

    public void setModifydatetime(Date modifydatetime) {
        this.modifydatetime = modifydatetime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", createdatetime=" + createdatetime +
                ", modifydatetime=" + modifydatetime +
                '}';
    }
}
