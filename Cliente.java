package Exercicio2banco;

import com.sun.jdi.PrimitiveValue;

public class Cliente {
    private String RG;
    private String CPF;
    private int NumDeCliente;
    private String SobreNome;

    public Cliente(String RG, String CPF, int numDeCliente, String sobrenome) {
        this.RG = RG;
        this.CPF = CPF;
        this.NumDeCliente = numDeCliente;
        this.SobreNome = sobrenome;
    }





    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumDeCliente() {
        return NumDeCliente;
    }

    public void setNumDeCliente(int numDeCliente) {
        NumDeCliente = numDeCliente;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setSobreNome(String sobreNome) {
        SobreNome = sobreNome;
    }
}
