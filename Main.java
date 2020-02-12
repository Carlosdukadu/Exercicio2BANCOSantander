package Exercicio2banco;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("41.208", "41.209", 01, "Eduardo");
        Conta contaEduardo = new Conta(cliente1, -400);
        ContaPoupança contaEduardoP = new ContaPoupança(cliente1, 1000);


        contaEduardo.deposito(1);
        contaEduardo.saque(900);
        contaEduardo.verSaldo();

        contaEduardoP.depositoContaP(500);
        contaEduardoP.saqueContaP(100);
        contaEduardoP.verSaldoContaP();


    }
}
