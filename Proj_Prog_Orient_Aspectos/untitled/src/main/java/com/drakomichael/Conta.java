package com.drakomichael;

public class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: R$" + valor);
    }

    public double getSaldo() {
        return saldo;
    }
}