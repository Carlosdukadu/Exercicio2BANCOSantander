package Exercicio2banco;

import java.security.PublicKey;

public class ContaPoupança {
    private Cliente cliente;
    private double SaldoContaP ;


    //Construtor
    public ContaPoupança(Cliente cliente, double saldoContaP) {
        this.cliente = cliente;
        SaldoContaP = saldoContaP;
    }


    //Métodos
    public void saqueContaP(double valor) {
        if (SaldoContaP >= valor) {
            this.SaldoContaP -= valor;
            System.out.println("Saque de R$ " + valor + " realizado");
        } else {
            System.out.println("Valor não disponível");
        }
    }
    public void depositoContaP(double valor){
        if(valor > 0){
            this.SaldoContaP = SaldoContaP + valor;
            System.out.println("Depósito de R$ " + valor + " realizado");
        } else {
            System.out.println("Nenhum valor definido para depósito");
        }
    }

    public void verSaldoContaP(){
        getSaldoContaP();
        System.out.println("Seu saldo atual na conta POUPANÇA é = R$ " + getSaldoContaP());
    }

    public void juros() {
        if (getSaldoContaP() > 0) {

            this.SaldoContaP = SaldoContaP * 0.5;
        }
    }






    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldoContaP() {
        return SaldoContaP;
    }

    public void setSaldoContaP(double saldoContaP) {
        SaldoContaP = saldoContaP;
    }
}
