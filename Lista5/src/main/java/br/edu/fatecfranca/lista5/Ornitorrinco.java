/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista5;

/**
 *
 * @author danielfacciolo
 */
public class Ornitorrinco implements IMamifero, IAve{

    // simulação de herança múltipla -> não herda código
    // herda comportamento
  
    
    @Override
    public void darMama() {
        System.out.println("Ornitorrinco dando mama");
    }

    @Override
    public void voar() {
        System.out.println("Ornitorrinco voando");
    }

    @Override
    public void botarOvo() {
        System.out.println("Ornitorrinco botando ovo");
    }

  
    
   
    
    
    
}
