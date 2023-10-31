package br.com.paulocsr.school.entities;

import java.util.List;

import br.com.paulocsr.school.vo.CPF;
import br.com.paulocsr.school.vo.Email;
import br.com.paulocsr.school.vo.Telefone;


public class Student {
    private CPF cpf;
    private String name;
    private Long registration;
    private Email email;

    public Student(CPF cpf, String name, Long registration, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.registration = registration;
        this.email = email;
    }

    private List<Telefone> telefones;

    public void addPhone(Telefone phone) {
        this.telefones.add(phone);
    }

}
