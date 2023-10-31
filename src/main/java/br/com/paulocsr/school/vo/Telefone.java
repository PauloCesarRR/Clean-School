package br.com.paulocsr.school.vo;

import lombok.Data;

@Data
public class Telefone {
    
    private String ddd;
    private String number;

    public Telefone(String ddd, String number) {
        if (ddd == null && number == null) {
            throw new IllegalArgumentException("DDD e Numero sao obrigatorios!");
        }
    
        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD invalido!");
        }
    
        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero invalido!");
        }
        this.ddd = ddd;
        this.number = number;
    }

}
