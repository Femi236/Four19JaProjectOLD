package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(StepsId.class)
@Table(name = "steps")
public class Steps {

    @Id
    @Column(name = "post")
    private Integer post;

    @Id
    @Column(name = "stepNumber")
    private Integer stepNumber;

    @Column(name = "instruction")
    private String instruction;

    public Steps() {

    }

    public Steps(Integer post, Integer stepNumber, String instruction) {
        this.post = post;
        this.stepNumber = stepNumber;
        this.instruction = instruction;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public Integer getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(Integer stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Steps) {
            Steps step = (Steps) o;

            return post == step.post && stepNumber == step.stepNumber;
        }
        return false;
    }
}
