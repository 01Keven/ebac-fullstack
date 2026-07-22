package com.orientacaoobjeto.entity;

public class Professor {

    String nome = "keven";
    String materia = "POO";
    String escola = "EBAC";

    private void lecionarAula() {
        System.out.printf("O professor %s da materia %s da esola %s", nome, materia, escola);
    }

    @Override
    public String toString() {
        return "nada aqui";
    }
}
