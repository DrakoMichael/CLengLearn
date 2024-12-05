package com.drakomichael;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(500.00);

        System.out.println("=== Operações na Conta ===");

        // Operação de Depósito
        conta.depositar(100.00);

        // Operação de Saque
        conta.sacar(200.00);

        // Operação de Saque com saldo insuficiente
        conta.sacar(600.00);
    }
}