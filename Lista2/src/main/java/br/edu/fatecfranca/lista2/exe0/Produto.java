package br.edu.fatecfranca.lista2.exe0;

// algo abstrato e serve de modelo para seus objetos
public final class Produto {
    private String nome; // tipo de dado é String (uma classe)
    private int qtde; // tipo de dado é int (tipo primitivo)
    private double preco; // tipo de dado é double (tipo primitivo)
    
    // cria um método construtor
    public Produto(){
        
    }
    // cria um método construtor
    public Produto(String nome, int qtde, double preco){
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQtde(int qtde){
        if (qtde >= 0) 
            this.qtde = qtde;
        else 
            System.out.println("Qtde negativa");
    }
    public void setPreco(double preco){
        if (preco >= 0)
            this.preco = preco;
        else 
            System.out.println("Preço negativo");
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getQtde(){
        return this.qtde;
    }
    public double getPreco(){
        return this.preco;
    }
    // método que compra um produto, aumentando sua qtde
    // método não retorna nada
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x){
        this.setQtde(this.qtde - x);
    }
    // this representa o objeto que chama o método
    public void mostrar(){
         System.out.println(" Nome: " + this.nome + " Qtde: " + 
                this.qtde + " Preço " + this.preco);
    }
    
    public void subir(double x){
        this.preco += x;
    }
    public void descer(double x){
        this.setPreco(this.preco - x);
    }
    
}
