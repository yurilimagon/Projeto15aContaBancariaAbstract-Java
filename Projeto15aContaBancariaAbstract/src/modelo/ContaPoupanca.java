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
public class ContaPoupanca extends ContaBancaria {
    //ATRIBUTOS
    private double limite;
    
    //CONSTRUTORES
    //VAZIO
    public ContaPoupanca() {
    }
    //CHEIO
    public ContaPoupanca(double limite, String num_conta, double saldo) {
        super(num_conta, saldo);
        this.limite = limite;
    }
    
    //GETTERS E SETTERS
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //MÉTODOS
    @Override
    public double sacar(double valor){
        if(((this.saldo - valor) + this.limite) < 0){
            System.out.println("Saque não permitido. Saque ultrapassa o valor do SALDO + LIMITE.");
            return this.saldo;
        }
        else{
            this.saldo -= valor;
            return this.saldo;
        }
    }
    @Override
    public double depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }
}
