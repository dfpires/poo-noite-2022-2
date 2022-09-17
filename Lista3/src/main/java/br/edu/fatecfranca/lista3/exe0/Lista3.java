/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.lista3.exe0;

import java.util.Date;

/**
 *
 * @author danielfacciolo
 */
public class Lista3 {

    public static void main(String[] args) {
        Aluno objAluno = new Aluno(123, "Pedro", "Franca");
        
        Disciplina objDisciplina = new Disciplina(10, "POO", "Programação");
        
        Matricula objMatricula = 
                new Matricula(1, new Date(), objAluno, objDisciplina);
        
        System.out.println(objMatricula.toString());
        
        MatriculaComposicao objMatriculaComposicao = 
                
                new MatriculaComposicao(1, new Date(), 123, "Pedro", "Franca", 
                        10, "POO", "Programação");
        
    }
}
