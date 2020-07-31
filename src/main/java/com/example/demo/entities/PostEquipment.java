package com.example.demo.entities;

import javax.persistence.*;

@Entity
@IdClass(PostEquipmentID.class)
@Table(name = "postequipment")
public class PostEquipment {
    @Id
    @Column(name = "post")
    private Integer post;

    @Id
    @Column(name = "equipment")
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
