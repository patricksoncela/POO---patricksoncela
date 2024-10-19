package com.company;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 2500;
    }

    @Override
    public String descreverResponsibilidades() {
        return "Desenvolve";
    }
}
