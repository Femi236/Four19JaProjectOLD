package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private Integer postID;

    @Column(name = "user")
    private Integer user;

    @Column(name = "time_taken")
    private Integer timeTaken;

    public Post() {
        super();
    }

    public Post(Integer user, Integer timeTaken) {
        this.user = user;
        this.timeTaken = timeTaken;
    }

    public Integer getTimeTaken() {
        return timeTaken;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public void setTimeTaken(Integer timeTaken) {
        this.timeTaken = timeTaken;
    }
}
