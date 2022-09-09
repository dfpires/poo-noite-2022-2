/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista2.exe2;

/**
 *
 * @author danielfacciolo
 */
public class Aluno {
    private int nroAluno;
    private String nome;
    private int idade;
    private float p1, p2;
    
    public Aluno(){
        
    }
    public Aluno(int nroAluno, String nome, 
            int idade, float p1, float p2){
        
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public void setNroAluno(int nroAluno) {
        
        String aux = Integer.toString(nroAluno);
        
        if (aux.length() == 6){
            this.nroAluno = nroAluno;
        }
        else System.out.println(" tamanho inválido");
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("tamanho inválido");
    }

    public void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        }
        else System.out.println("Idade negativa");
    }

    public void setP1(float p1) {
        if (p1 >= 0){
            this.p1 = p1;
        }
        else System.out.println("P1 não pode ser negativo");
    }

    public void setP2(float p2) {
        if (p2 >= 0){
            this.p2 = p2;
        }
        else System.out.println("P2 não pode ser negativo");
    }
    public void notaFinal(){
        float media = (this.p1 + this.p2) / 2;
        System.out.println("A média é " + media);
    }
    
    public void dadosAluno(){
        System.out.println("Número" + this.nroAluno +
                " Nome " + this.nome + " Idade: " + this.idade);
    }
}
