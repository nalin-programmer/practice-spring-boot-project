package com.example.bootjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    public int aid;
    public String aname;

    public String tech;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Aline{" +
                "aid=" + aid +
                ", tech=" + tech +
                ", aname='" + aname + '\'' +
                '}';
    }
}