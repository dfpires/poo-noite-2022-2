package br.edu.fatecfranca.lista2;

import br.edu.fatecfranca.lista2.exe0.Produto;

public class Lista2 {

    public static void main(String[] args) {
        
        Produto obj1 = new Produto();
        obj1.setNome("Ovo");
        obj1.setQtde(-10);
        obj1.setPreco(-52);
        System.out.println("Nome: " + obj1.getNome());
        
        Produto obj2 = new Produto();
        obj2.setNome("Pão");
        obj2.setQtde(10);
        obj2.setPreco(52);
        System.out.println("Preço " + obj2.getPreco());
        
    }
}
