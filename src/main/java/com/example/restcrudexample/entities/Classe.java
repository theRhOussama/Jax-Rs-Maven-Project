package com.example.restcrudexample.entities;

import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.enterprise.inject.Model;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Model
public class Classe {

    private int id;
    private String classeName;

    public Classe(int id, String classeName) {
        this.id = id;
        this.classeName = classeName;
    }

    public Classe(String classeName) {
        this.classeName = classeName;
    }

    public Classe() {
    }

    public int getId() {
        return id;
    }

    public String getClasseName() {
        return classeName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClasseName(String classeName) {
        this.classeName = classeName;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "id=" + id +
                ", classeName='" + classeName + '\'' +
                '}';
    }
}
