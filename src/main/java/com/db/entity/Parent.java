package com.db.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Parent implements Serializable{
    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    private String name;

    public Parent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
