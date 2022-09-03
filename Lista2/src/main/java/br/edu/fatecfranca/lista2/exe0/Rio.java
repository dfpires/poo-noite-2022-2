
package br.edu.fatecfranca.lista2.exe0;

public final class Rio {
   private String nome;
   private double nivel;
   private boolean poluido; // true - está poluído, false - não está poluido

   public Rio(){
        
    }
    public Rio(String nome, double nivel, boolean poluido){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setPoluido(poluido);
    }
    
    public void ensolarar(double x){
       this.setNivel(this.nivel - x);
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

    public void setNome(String nome) {
        
       
        this.nome = nome;
    }

    public void setNivel(double nivel) {
        if (nivel >= 0){
            this.nivel = nivel;
        }
        else System.out.println("Nível negativo");
    }

    public void setPoluido(boolean poluido) {
        this.poluido = poluido;
    }
    
    public String getNome(){
        return this.nome;
    }
    public double getNivel(){
        return this.nivel;
    }
    public boolean isPoluido(){
        return this.poluido;
    }
}
