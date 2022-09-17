/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista3.exe1;

import java.util.Date;

/**
 *
 * @author danielfacciolo
 */
public class Reserva {
    
    private int id;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva(){
        
    }

    public Reserva(int id, Date data, Passageiro passageiro, Voo voo) {
        this.id = id;
        this.data = data;
        this.passageiro = passageiro;
        this.voo = voo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", data=" + data + 
                ", \n passageiro=" + passageiro + 
                ", \n voo=" + voo + '}';
    }
    
    
    
    
}
