package br.edu.fatecfranca.lista2.exe1;
public final class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;
    
    public Cliente(){
        this.nroAgencia = "ainda não definido";
        this.nroConta = "ainda não definido";
    }
    
    public Cliente(String nroConta, String nroAgencia, String nome, 
            float saldo){
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    
    public void setNroConta(String nroConta){
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("Dígito verificar errado");
        }
        else System.out.println("Tamanho inválido");
    }
    
     public void setNroAgencia(String nroAgencia){
        if (nroAgencia.length() == 6){
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else System.out.println("Dígito verificar errado");
        }
        else System.out.println("Tamanho inválido");
    }
     
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Tamanho inválido");
    }
    
    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo negativo");
    }
    
    public void depositar(float x){
        this.saldo += x;
    }
    
    public void sacar(float x){
        this.setSaldo(this.saldo - x);
    }
    
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void mostrar(){
        System.out.println("Conta: " + this.nroConta + 
                " Agência " + this.nroAgencia +
                " Nome: " + this.nome + 
                " Saldo: " + this.saldo);
    }
}
