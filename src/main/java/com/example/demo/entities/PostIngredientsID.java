package com.example.demo.entities;

import java.io.Serializable;

public class PostIngredientsID implements Serializable {
    private long post;
    private long ingredient;

    public PostIngredientsID(long post, long ingredient) {
        this.post = post;
        this.ingredient = ingredient;
    }
}
