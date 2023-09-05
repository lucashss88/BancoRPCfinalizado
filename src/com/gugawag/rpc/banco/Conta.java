package com.gugawag.rpc.banco;

public class Conta {
    Integer numero;
    double saldo;

    public Conta(Integer n, double s){
        this.numero = n;
        this.saldo = s;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
