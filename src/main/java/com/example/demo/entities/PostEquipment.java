package com.example.demo.entities;

import javax.persistence.*;

@Entity
@IdClass(PostEquipmentID.class)
public class PostEquipment {
    @Id
    private Integer post;

    @Id
    private Integer equipment;

    public PostEquipment() {
        super();
    }

    public PostEquipment(Integer post, Integer equipment) {
        this.post = post;
        this.equipment = equipment;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getEquipment() {
        return equipment;
    }

    public void setEquipment(Integer equipment) {
        this.equipment = equipment;
    }
}
