
package br.edu.fatecfranca.lista5.exe1;

public class TestaPessoaCidade {

    public static void main(String[] args) {

        Pessoa fulano = new Pessoa();
	Cidade franca = new Cidade();
        franca.contrata(fulano); // contrato Professor
 // conversão de objetos - convertendo um professor em um empregado
	franca.contrata((IEmpregado) fulano); // contrata Empregado
	franca.cobraDe(fulano);
	franca.registra(fulano);
	franca.alimenta(fulano);

        
    }
    
}
