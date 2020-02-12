package Exercicio2banco;

import javax.lang.model.element.NestingKind;

public class Cheque extends Conta {
    private int valorDoCheque;
    private String bancoEmissor;
    private String dataDePagamento;


    //Métodos
    public void depositoemCheque(double valorDoCheuqe) {
        if (valorDoCheuqe >= 500) {
            setSaldo(getSaldo() + valorDoCheuqe);
            System.out.println("Seu saldo atual após o depósito é de " + getSaldo());
        }
    }

    //Construtor


    public Cheque(int valorDoCheque, String bancoEmissor, String dataDePagamento) {
        this.valorDoCheque = valorDoCheque;
        this.bancoEmissor = bancoEmissor;
        this.dataDePagamento = dataDePagamento;
    }


    public int getValorDoCheque() {
        return valorDoCheque;
    }

    public void setValorDoCheque(int valorDoCheque) {
        this.valorDoCheque = valorDoCheque;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(String dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }
}


