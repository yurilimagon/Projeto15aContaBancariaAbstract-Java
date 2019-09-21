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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIANDO OBJETOS
        ContaCorrente cc1 = new ContaCorrente(1.00, "00.001", 1000.00);
        ContaPoupanca cp1 = new ContaPoupanca(300.00, "00.002", 1000.00);
        
        //SAQUE ContaCorrente
        System.out.println("Saque CC: \nConta Corrente: " + cc1.getNum_conta() + "\nSaldo: R$" + cc1.getSaldo() +
                           "\nTaxa de Operação: R$" + cc1.getTaxaDeOperacao());
        System.out.println("Saldo após Operação: R$" + cc1.sacar(100));
        //DEPÓSITO ContaCorrente
        System.out.println("\nDepósito CC: \nConta Corrente: " + cc1.getNum_conta() + "\nSaldo: R$" + cc1.getSaldo() +
                           "\nTaxa de Operação: R$" + cc1.getTaxaDeOperacao() + "\nSaldo após Operação: R$" + 
                                                         cc1.depositar(100));
        
        //SAQUE ContaPoupança
        System.out.println("\nSaque CP: \nConta Poupança: " + cp1.getNum_conta() + "\nSaldo: R$" + cp1.getSaldo() + 
                           "\nLimite: R$" + cp1.getLimite());
        System.out.println("Saldo após Operação: R$" + cp1.sacar(1300));
        //DEPÓSITO ContaPoupança
        System.out.println("\nDepósito CP: \nConta Poupança: " + cp1.getNum_conta() + "\nSaldo: R$" + cp1.getSaldo() + 
                           "\nLimite: R$" + cp1.getLimite());
        System.out.println("Saldo após Operação: R$" + cp1.depositar(300));
    }
    
}
