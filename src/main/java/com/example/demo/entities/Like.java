package com.example.demo.entities;

import javax.persistence.*;

@Entity
@IdClass(LikeID.class)
@Table(name = "like")
public class Like {

    @Id
    @Column(name = "user")
    private Integer user;

    @Id
    @Column(name = "post")
    private Integer post;

    public Like() {
        super();
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }
}
