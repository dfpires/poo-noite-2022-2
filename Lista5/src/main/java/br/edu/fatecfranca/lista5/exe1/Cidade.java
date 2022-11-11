/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista5.exe1;

/**
 *
 * @author danielfacciolo
 */
public class Cidade {
    
    // Pessoa objPessoa = new Pessoa()
    //contrata(objPessoa)
    public void contrata(IProfessor p){
	p.ensina();
	p.trabalha();
    }
    // IEmpregado objEmpregado = new Pessoa()
    // contrata(objEmpregado)
    public void contrata(IEmpregado e){
            e.trabalha();
    }

    public void cobraDe(IContribuinte c) {
            c.pagaIr();
    }

    public void registra(ICidadao c) {
            c.tiraRg();
    }

    public void alimenta(Animal a ){
            a.come();
    }


}
