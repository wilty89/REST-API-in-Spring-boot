package com.wilber.Spring.Initializr.Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDto(Object id, Object firstName, Object lastName, Object email) {
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
}