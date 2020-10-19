package com.speak.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.speak.model.post.Image;
import com.speak.model.post.Post;
import com.speak.model.post.Video;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
    //@JsonIgnore
    @ToString.Exclude
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

    private String bannerImage;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Video> allvideos;

    @OneToMany
    private List<User> friends;

    @OneToMany(fetch= FetchType.EAGER, mappedBy="author", cascade = CascadeType.ALL)
    private List<Post> posts;



}
