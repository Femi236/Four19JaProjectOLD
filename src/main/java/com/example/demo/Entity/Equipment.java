package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer equipmentID;

    private String name;

    public Equipment () {
    }

    public Equipment(Integer equipmentID, String name) {
        this.equipmentID = equipmentID;
        this.name = name;
    }

    public Integer getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Integer equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return equipmentID.equals(equipment.equipmentID) &&
                name.equals(equipment.name);
    }
}