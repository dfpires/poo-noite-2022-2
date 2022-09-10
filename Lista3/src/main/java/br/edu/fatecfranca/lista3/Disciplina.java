/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista3;

/**
 *
 * @author danielfacciolo
 */
public class Disciplina {
    private int id;
    private String nome;
    private String area;

    public Disciplina() {
    }

    public Disciplina(int id, String nome, String area) {
        this.id = id;
        this.nome = nome;
        this.area = area;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}
