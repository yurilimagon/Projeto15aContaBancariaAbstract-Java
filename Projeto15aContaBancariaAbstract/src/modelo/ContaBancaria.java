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
public abstract class ContaBancaria {
    //ATRIBUTOS
    protected String num_conta;
    protected double saldo;
    
    //CONSTRUTORES
    //VAZIO
    public ContaBancaria() {
    }
    //CHEIO
    public ContaBancaria(String num_conta, double saldo) {
        this.num_conta = num_conta;
        this.saldo = saldo;
    }
    
    //GETTERS E SETTERS
    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //METODOS
    public abstract double sacar(double valor);
    public abstract double depositar(double valor);
    
}
