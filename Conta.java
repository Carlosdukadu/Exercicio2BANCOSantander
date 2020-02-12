package Exercicio2banco;

public class Conta {
    private Cliente cliente;
    private double Saldo;


    //Métodos

    public void saque(double valor) {


       if (Saldo <= 0 && Saldo >= -500 ){
            this.Saldo -= valor;
            System.out.println("Você esta usando seu cheque especial");
            System.out.println("Saque de R$ " + valor + " realizado");

       } else if (Saldo >= valor) {
            this.Saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado");

        } else { System.out.println("Você usou todo seu limite ou esse valor é maior que o limite disponivel, não foi possivel realizar o saque");
       }

    }


    public void deposito(double valor){
        if(valor > 0){
            this.Saldo = Saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado");
        } else {
            System.out.println("Nenhum valor definido para depósito");
        }
    }

    public void verSaldo(){
        getSaldo();
        System.out.println("Seu saldo atual na conta CORRENTE é = R$ " + getSaldo());
    }




    //Construtor
    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        Saldo = saldo;
    }

    public Conta(){

    }





    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}
