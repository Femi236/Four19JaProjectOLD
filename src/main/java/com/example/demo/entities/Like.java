package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(LikeID.class)
@Table(name = "likes")
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

    public Like(Integer user, Integer post) {
        this.user = user;
        this.post = post;
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
