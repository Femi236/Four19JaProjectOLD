package com.example.demo.entities;

import java.io.Serializable;

public class PostEquipmentID implements Serializable {

    private Integer post;

    private Integer equipment;

    public PostEquipmentID() {

    }

    public PostEquipmentID(Integer post, Integer equipment) {
        this.post = post;
        this.equipment = equipment;
    }
}
