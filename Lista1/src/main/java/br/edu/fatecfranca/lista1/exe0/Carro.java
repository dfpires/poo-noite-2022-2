package br.edu.fatecfranca.lista1.exe0;
public class Carro {
    
    public String marca, modelo;
    public double velAtual;
    public boolean statusMotor; // true ou false
    
    // crie os dois construtores da classe Carro
    public Carro(){
        
    }
    public Carro(String marca, String modelo, double velAtual, 
            boolean statusMotor){
        this.marca = marca;
        this.modelo = modelo;
        this.velAtual = velAtual;
        this.statusMotor = statusMotor;
    }
    
    // faça um método para ligar o motor do carro
    public void ligar(){
        if (!this.statusMotor){
            this.statusMotor = true;
        }
    }
    // faça um método para desligar o motor do carro
    public void desligar(){
        if (this.velAtual > 0){
            this.velAtual = 0;
        }
        if (this.statusMotor){
            this.statusMotor = false;
        }
    }
    
    // faça um método para acelerar o carro de x unidades
    public void acelerar(double x){
        if (this.statusMotor){
            this.velAtual += x;
        }
    }
    // faça um método para frear o carro x de unidades
    public void frear(double x){
        if (this.statusMotor){
            if (x <= this.velAtual) {
                this.velAtual -= x;
            }
            else System.out.println("Vel não pode ser negativo");
        }
        else System.out.println("Carro desligado");
    }
    
}
