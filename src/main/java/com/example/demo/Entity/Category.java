package com.example.demo.Entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer categoryID;

    private String name;

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
