package com.db.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "person")
public class Person implements Serializable{
    @Id
    @GeneratedValue
    @Column(name="PERSON_ID")
    private Long personId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
