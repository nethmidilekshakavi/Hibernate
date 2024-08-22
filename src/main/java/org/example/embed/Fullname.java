package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class Fullname {
    private String firstname;
    private String lastname;

    private Fullname name;

    public Fullname() {
    }

    public Fullname(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(Fullname name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Fullname getName() {
        return name;
    }
}
