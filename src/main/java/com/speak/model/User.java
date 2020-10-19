package com.speak.model;

import javax.persistence.*;

@Entity
@Table(name="speak")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String emailAddress;
    private String gender;
    private String phoneNumber;
    private String address;

}
