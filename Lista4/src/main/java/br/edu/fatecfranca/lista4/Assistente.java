/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista4;

/**
 *
 * @author danielfacciolo
 */
public class Assistente extends Funcionario {
    
    private float horaExtra;
    private String quemAssiste;
    
    public Assistente(){
        super();
    }

    public Assistente(float horaExtra, String quemAssiste, 
            String nome, String cpf, int codigo, float salario, float cargaHoraria) {
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.horaExtra = horaExtra;
        this.quemAssiste = quemAssiste;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    public String getQuemAssiste() {
        return quemAssiste;
    }

    public void setQuemAssiste(String quemAssiste) {
        this.quemAssiste = quemAssiste;
    }

    @Override
    public String toString() {
        return "Assistente{" + "horaExtra=" + horaExtra + 
                ", quemAssiste=" + quemAssiste +  "\n" +
                 super.toString() + '}';
    }
    
    @Override
    public float calculaSalario(){
        return this.salario + 
                this.horaExtra * (this.salario / this.cargaHoraria); 
    }
    
    
}
