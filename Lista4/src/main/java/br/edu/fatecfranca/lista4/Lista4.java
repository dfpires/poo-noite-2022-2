/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.lista4;

/**
 *
 * @author danielfacciolo
 */
public class Lista4 {

    public  static void polimorfismo(Funcionario objFuncionario){
        // objFuncionario = objGerente
        // OU
        // objFuncionario = objAssistente
        // OU
        
        System.out.println(objFuncionario.toString());
    }
    public static void main(String[] args) {
       
        Gerente objGerente = new Gerente(2000, "Fulano", "123", 
            1, 4000, 40);
        polimorfismo(objGerente);
        
        Assistente objAssistente = new Assistente(10, "Fulano", "Beltrano", 
            "345", 2, 2000, 40);
        polimorfismo(objAssistente);
        
        Diretor objDiretor = new Diretor(10, "Ciclano", "789", 3, 5000, 40);
        polimorfismo(objDiretor);
        
    }
}
