package com.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CHILD2")
public class SecondChild extends Parent {
    @Column(name ="TYPE")
    private String type;

    @Column(name = "CITY")
    private String city;

    /*public SecondChild(){

    }*/

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
