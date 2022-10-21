/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.lista5;

/**
 *
 * @author danielfacciolo
 */
public class Lista5 {

    public static void main(String[] args) {
        
        IMamifero objMamifero = new Ornitorrinco();
        objMamifero.darMama();
        
        IAve objAve = new Ornitorrinco();
        objAve.botarOvo();
        objAve.voar();
        
        Ornitorrinco objOrnitorrinco = new Ornitorrinco();
        objOrnitorrinco.botarOvo();
        objOrnitorrinco.darMama();
        objOrnitorrinco.voar();
        
    }
}

