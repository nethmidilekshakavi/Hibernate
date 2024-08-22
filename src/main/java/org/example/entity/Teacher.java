package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tea")
public class Teacher {

    @Id
    private String id;
    private String name;
    private String address;

    public Teacher() {

    }

    public Teacher(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
