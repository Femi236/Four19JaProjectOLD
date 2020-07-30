package com.example.demo.entities;

import java.io.Serializable;

public class PostCategoryID implements Serializable {
    private Integer post;
    private Integer category;

    public PostCategoryID(Integer post, Integer catrgory) {
        this.post = post;
        this.category = catrgory;
    }
}
