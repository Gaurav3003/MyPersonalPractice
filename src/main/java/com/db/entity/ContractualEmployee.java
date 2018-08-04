package com.db.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="CONTRACT_EMPLOYEE")
@DiscriminatorValue(value = "Contractual")
public class ContractualEmployee extends Person{
    @Column(name="CONTRACT_NAME")
    private String contractName;

    @Column(name = "VALID_UPTO")
    private Integer validity;

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }
}
