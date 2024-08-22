package org.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Stu") /*student kiyl gane na entity eke vithri name eka changr wenne*/
/*@Table(name = "test")*//* tabel eke vithri name eka changr wenne entity eke name eka cahnge wenne na*/
public class Student {
    @Id
    private String id;
    private String name;
    private String address;

    public Student() {
    }

    public Student(String id, String name, String address) {
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
