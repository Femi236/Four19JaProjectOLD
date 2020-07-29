package com.example.demo.Entity;

import java.io.Serializable;

public class StepsId implements Serializable {
    private Integer post;
    private Integer stepNumber;

    public StepsId(){

    }

    public StepsId(Integer post, Integer stepNumber) {
        this.post = post;
        this.stepNumber = stepNumber;
    }
}
