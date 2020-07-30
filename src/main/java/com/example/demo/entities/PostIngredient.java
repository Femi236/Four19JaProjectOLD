package com.example.demo.entities;

import javax.persistence.*;

@Entity
@IdClass(PostIngredientID.class)
@Table(name = "postIngredient")
public class PostIngredient {
    @Id
    private Integer post;

    @Id
    private Integer ingredient;

    private String amount;

    //private String unit;

    public PostIngredient() {
    }

    public PostIngredient(Integer post, Integer ingredient, String amount) {
        this.post = post;
        this.ingredient = ingredient;
        this.amount = amount;
        //this.unit = unit;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getIngredient() {
        return ingredient;
    }

    public void setIngredient(Integer ingredient) {
        this.ingredient = ingredient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostIngredient that = (PostIngredient) o;
        return post == that.post &&
                ingredient == that.ingredient &&
                amount.equals(that.amount);
    }
}
