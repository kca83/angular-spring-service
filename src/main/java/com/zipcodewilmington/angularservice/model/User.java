package com.zipcodewilmington.angularservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
	private Long id;

    @Column(name = "name")
    private String firstName;

	public User() {}

    public User(Long id, String fname) {
        this.id = id;
        this.firstName = fname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
