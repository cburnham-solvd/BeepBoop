package com.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Size(min = 2, max =50)
    @Pattern(regexp = "[A-Za-z. ]*", message = "First name requires valid character")
    private String firstname;

    @Size(min = 2, max =50)
    @Pattern(regexp = "[A-Za-z. ]*", message = "First name requires valid character")
    private String lastname;


    //@Column(unique = true)
    @NotNull(message =  "Email requires valid value")
    @NotEmpty(message = "Email requires non empty value")
    @Email(message =    "Email requires valid format")
    private String email;

    @Size(min = 2, max =50)
    @Pattern(regexp = "[A-Za-z.0-9 ]*", message = "First name requires valid character")
    private String password;

    @Pattern(regexp = "[0-9.\\-+ ]*", message = "Phone requires valid alphanumaric characters")
    private String phone;

    private int age;
    /*setter getter method here*/



}