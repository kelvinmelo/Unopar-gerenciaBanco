/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

import java.util.Scanner; //Biblioteca para entrada de dados

/**
 *
 * @author Kelvin Fernando de Melo
 * Portfólio - Linguagem orientada a objetos
 */


class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Double saldo;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 900.00;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é R$ " + saldo);
    }    

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
           System.out.println("Seu deposito no valor de R$ " + valor + "foi realizado com sucesso.");
        } else { 
        System.out.println("Valor invalido");
        }   
    } 

    public void sacar (double valor) {
    if (valor > 0 && valor <= saldo) {
            saldo -= valor;
           System.out.println("Seu saque de R$ " + valor + "foi realizado com sucesso.");
        } else { 
        System.out.println("Saldo insuficiente");
        }  
    }
}

public class GerenciaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Insira seu nome");
        String nome = scanner.nextLine();
        System.out.println("Insira seu sobrenome");
        String sobrenome = scanner.nextLine();      
        System.out.println("Insira seu CPF");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, sobrenome, cpf);

        boolean continuar = true;
        while(continuar) {
            System.out.println("\nO que deseja:");
            System.out.println("1 - consultar saldo:");
            System.out.println("2 - Realizar deposito:");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Encerrar aplicação\n\n");

        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                cliente.consultarSaldo();
                break;
            case 2:
                System.out.println("Informe o valor a ser depositado:");
                double valorDeposito = scanner.nextDouble();
                cliente.depositar(valorDeposito);
                break;
            case 3:
                System.out.println("Informe o valor a ser sacado:");
                double valorSaque = scanner.nextDouble();
                cliente.sacar(valorSaque);
                break;
            case 4:
                continuar = false;
                System.out.println("Até a próxima!");
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;
        }
    }       
    }
}


