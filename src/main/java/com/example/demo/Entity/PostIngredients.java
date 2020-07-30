package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(PostIngredientsID.class)
@Table(name = "postIngredients")
public class PostIngredients {
    @Id
    private long post;

    @Id
    private long ingredient;

    private Integer amount;

    //private String unit;

    public PostIngredients() {
    }

    public PostIngredients(long post, long ingredient, Integer amount) {
        this.post = post;
        this.ingredient = ingredient;
        this.amount = amount;
        //this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostIngredients that = (PostIngredients) o;
        return post == that.post &&
                ingredient == that.ingredient &&
                amount.equals(that.amount);
    }
}
