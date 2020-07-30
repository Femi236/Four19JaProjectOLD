package com.example.demo.entities;

import javax.persistence.*;

@Entity
@IdClass(PostEquipmentID.class)
public class PostEquipment {
    @Id
    private Integer post;

    @Id
    private Integer Equipment;

    public PostEquipment() {
        super();
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getEquipment() {
        return Equipment;
    }

    public void setEquipment(Integer equipment) {
        Equipment = equipment;
    }
}
