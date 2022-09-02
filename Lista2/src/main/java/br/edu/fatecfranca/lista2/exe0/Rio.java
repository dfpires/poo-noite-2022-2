
package br.edu.fatecfranca.lista2.exe0;

public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido; // true - está poluído, false - não está poluido

    public Rio(){
        
    }
    public Rio(String nome, double nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void ensolarar(double x){
        if (x <= this.nivel){
            this.nivel -= x;
            System.out.println("Nível do rio foi diminuido");
        }
        else {
            System.out.println("Nível não pode ser negativo");
        }
    }
    
    public void chover(double x){
        this.nivel += x;
        System.out.println("Níve do rio foi aumentado");
    }
    
    public void sujar(){
        if (this.poluido){
            System.out.println("Rio já poluído");
        }
        else {
            this.poluido = true;
            System.out.println("Rio foi sujado");
        }
    }
    
    public void limpar(){
        if (!this.poluido){
            System.out.println("Rio já limpo");
        }
        else {
            this.poluido = false;
            System.out.println("Rio foi limpo");
        }
    }
    
    public String paraString(){
        String aux = (this.poluido ? "Está poluido" : "Está limpo");
        return "Nome " + this.nome + " nível " + this.nivel + " Situação " +
                aux;
    }
}
