/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class ContaCorrente extends ContaBancaria {
    //ATRIBUTOS
    private double taxaDeOperacao;
    
    //CONSTRUTORES
    //VAZIO
    public ContaCorrente() {
    }
    //CHEIO
    public ContaCorrente(double taxaDeOperacao, String num_conta, double saldo) {
        super(num_conta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    //GETTERS E SETTERS
    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    //METODOS HERDADOS
    @Override
    public double sacar(double valor){
        if(((this.saldo - valor) - this.taxaDeOperacao) < 0){
            System.out.println("Saque não permitido. Saldo não compatível com o valor do saque.");
            return this.saldo;
        }
        else{
            this.saldo = ((this.saldo - valor) - this.taxaDeOperacao);
            return this.saldo;
        }
    }
    
    @Override
    public double depositar(double valor){
        this.saldo = ((this.saldo + valor) - this.taxaDeOperacao);
        return this.saldo;
    }
}
