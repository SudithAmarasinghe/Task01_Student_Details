package com.firstApplication.FirstApplication.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class UserDTO {


    //id is used as primary key.
    //Can not be empty or null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer id;

    //first name should not empty
    //first name must be between 2 and 20 characters
    @NotEmpty
    @Size(min = 2, max = 30, message = "Student can have a first name between two and twenty characters")
    @Column(name = "f_name")
    private String firstName;

    //first name should not empty
    //first name must be between 2 and 20 characters
    @NotEmpty
    @Size(min = 2, max = 20, message = "Student can have a first name between two and twenty characters")
    @Column(name = "l_name")
    private String lastName;

    //Age is not less than 16
    //Age should not empty
    @NotEmpty
    @Size(min = 16, message = "student should be at least 16")
    @Column(name = "age")
    private Integer age;

    //email should not empty
    //email should be a valid email address
    @NotEmpty
    @Email
    @Column(name = "email")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
