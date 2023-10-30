package br.com.paulocsr.school.entities;

import lombok.Data;

@Data
public class Student {
    private String cpf;
    private String name;
    private Long registration;
    private Email email;

}
