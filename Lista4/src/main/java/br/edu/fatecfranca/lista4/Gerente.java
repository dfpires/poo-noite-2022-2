/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista4;

/**
 *
 * @author danielfacciolo
 */
public class Gerente extends Funcionario {
    
    private float bonificacao;

    public Gerente() {
        super();
    }

    
    public Gerente(float bonificacao, String nome, String cpf, 
            int codigo, float salario, float cargaHoraria) {
        
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.bonificacao = bonificacao;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonificacao=" + bonificacao + "\n" +
               super.toString() + '}';
    }
    
    @Override
    public float calculaSalario(){
        return this.salario + this.bonificacao;
    }
    
    
}
