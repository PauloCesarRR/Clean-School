package br.com.paulocsr.school.entities;

public class Indicacao {
    private Student indicado;
    private Student indicante;

    
    public Indicacao(Student indicado, Student indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
    }


}
