package com.example.demo.entities;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@IdClass(PostCategoryID.class)
public class PostCategory {
    @Id
    private Integer post;

    @Id
    private Integer category;



    public PostCategory() {

    }

    public PostCategory(Integer post, Integer category) {
        this.post = post;
        this.category = category;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}