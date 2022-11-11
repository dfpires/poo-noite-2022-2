/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.lista5.exe1;

/**
 *
 * @author danielfacciolo
 */
public class TestaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa objPessoa = new Pessoa();
        
        objPessoa.come();
        objPessoa.ensina();
        objPessoa.pagaIr();
        objPessoa.tiraCpf();
        objPessoa.tiraRg();
        objPessoa.trabalha();
        objPessoa.vota();
        objPessoa.respira();
        
        IContribuinte objContribuinte = new Pessoa();
        objContribuinte.pagaIr();
        objContribuinte.tiraCpf();
        
        
    }
    
}
