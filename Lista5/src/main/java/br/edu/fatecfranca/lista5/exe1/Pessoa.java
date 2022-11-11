package br.edu.fatecfranca.lista5.exe1;

/**
 *
 * @author danielfacciolo
 */
// quando uma classe implementa uma interface, ela é obrigada
// a implementar todos os métodos da interface
public class Pessoa extends Animal implements ICidadao, 
        IContribuinte, IProfessor {

    @Override
    public void vota() {
        System.out.println("Pessoa votando ...");
    }

    @Override
    public void tiraRg() {
        System.out.println("Pessoa tirando Rg");
    }

    @Override
    public void pagaIr() {
        System.out.println("Pessoa pagando IR");
    }

    @Override
    public void tiraCpf() {
        System.out.println("Pessoa tirando CPF");
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinando ");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhando ");
    }
        
}
