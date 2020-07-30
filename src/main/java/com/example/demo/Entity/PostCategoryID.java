package com.example.demo.Entity;

import java.io.Serializable;

public class PostCategoryID implements Serializable {
    private Integer post;
    private Integer category;

    public PostCategoryID(Integer post, Integer catrgory) {
        this.post = post;
        this.category = catrgory;
    }
}
