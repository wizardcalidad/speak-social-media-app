package com.speak.model.post;

import com.speak.model.user.User;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commentBody;

    @OneToOne
    private User commentAuthor;

    @ManyToOne
    private Post post_id;
}
