package com.company;

abstract class Funcionario implements IFuncionario{
    public String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        return "Salário: " + calcularSalario() + "\nResponsabilidades: " + descreverResponsibilidades();
    }
}
