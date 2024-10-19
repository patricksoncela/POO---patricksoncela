package com.company;

public class Gerente extends Funcionario{

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 5000;
    }

    @Override
    public String descreverResponsibilidades() {
        return "Gerenciar";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
