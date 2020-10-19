package com.speak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="speak")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String emailAddress;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(nullable = false)
    private String phoneNumber;
    @OneToOne
    private Address address;
    @Column(nullable = false)
    private Date dateOfBirth;
    private String profileImage;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Image> allImages;

}
