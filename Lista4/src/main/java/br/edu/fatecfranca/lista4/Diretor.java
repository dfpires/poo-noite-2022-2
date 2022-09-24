/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista4;

import javax.swing.JOptionPane;

/**
 *
 * @author danielfacciolo
 */
public class Diretor extends Funcionario{
    private float partLucros;
    public Diretor(){
        super();
    }     

    public Diretor(float partLucros, String nome, String cpf, int codigo, float salario, float cargaHoraria) {
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.partLucros = partLucros;
    }

    public float getPartLucros() {
        return partLucros;
    }

    public void setPartLucros(float partLucros) {
        this.partLucros = partLucros;
    }

    @Override
    public String toString() {
        return "Diretor{" + "partLucros=" + partLucros + "\n" +
                super.toString() + '}';
    }
    
    @Override
    public float calculaSalario(){
        String lucro = JOptionPane.showInputDialog("Informe lucro da empresa");
        float lucro2 = Float.parseFloat(lucro);
        return this.salario + (this.partLucros*lucro2) / 100;
    }
}
