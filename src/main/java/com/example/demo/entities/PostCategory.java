package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@IdClass(PostCategoryID.class)
@Table(name = "postcategory")
public class PostCategory {
    @Id
    @Column(name = "post")
    private Integer post;

    @Id
    @Column(name = "category")
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