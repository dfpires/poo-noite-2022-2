/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.lista3.exe1;

import java.util.Date;

/**
 *
 * @author danielfacciolo
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Passageiro objP = new Passageiro(1, "Fulano", "Franca");
        Voo objV = new Voo(10, "Campinas", "Belo Horizonte");
        
        Reserva objR = new Reserva(100, new Date(), objP, objV);
        
        System.out.println(objR.toString());
    }
    
}
