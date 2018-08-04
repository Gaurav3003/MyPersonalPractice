package com.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CHILD1")
public class FirstChild extends Parent {
    @Column(name ="TYPE")
    private String type;

    /*public FirstChild(){

    }*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
