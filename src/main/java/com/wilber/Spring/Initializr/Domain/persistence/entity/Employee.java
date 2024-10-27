package com.wilber.Spring.Initializr.Domain.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String email;

    public Employee(Object id, Object firstName, Object lastName, Object email) {
    }

    public Object getId() {
        return id;
    }

    public Object getFirstName() {
        return firstName;
    }

    public Object getLastName() {
        return lastName;
    }

    public Object getEmail() {
        return email;
    }

    public void setFirstName(Object firstName) {
    }

    public void setLastName(Object lastName) {
    }

    public void setEmail(Object email) {
    }
}