/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista3.exe1;

/**
 *
 * @author danielfacciolo
 */
public class Voo {
    
    private int id;
    private String origem, destino;

    public Voo(){
        
    }
    
    public Voo(int id, String origem, String destino) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    @Override
    public String toString() {
        return "Voo{" + "id=" + id + ", origem=" + origem + ", destino=" + destino + '}';
    }
    
    
}
