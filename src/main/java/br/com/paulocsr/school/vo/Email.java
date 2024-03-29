package br.com.paulocsr.school.vo;

import lombok.Data;

@Data
public class Email {
    
    private String address;

    public Email(String address) {
        if (address == null || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("E-mail errado");
        }
        this.address = address;
    }

}
