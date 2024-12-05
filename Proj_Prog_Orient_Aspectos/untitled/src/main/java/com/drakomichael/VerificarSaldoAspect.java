package com.drakomichael;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class VerificarSaldoAspect {

    @Before("execution(* Conta.sacar(..)) || execution(* Conta.depositar(..))")
    public void verificarSaldoAntesOperacao(JoinPoint joinPoint) {
        Conta conta = (Conta) joinPoint.getTarget();
        System.out.println("Saldo atual antes da operação: R$" + conta.getSaldo());
    }
}