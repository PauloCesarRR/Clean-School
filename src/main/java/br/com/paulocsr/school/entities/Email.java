package br.com.paulocsr.school.entities;

import lombok.Data;

@Data
public class Email {
    
    private String address;

    public Email(String address) {
        if (address == null || !address.matches("^([0-9a-zA-Z]+([_.-]?[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[0-9,a-z,A-Z,.,-]*(.){1}[a-zA-Z]{2,4})+$")){
            throw new IllegalArgumentException("E-mail errado");
        }
        this.address = address;
    }

}
