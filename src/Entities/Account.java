package Entities;

import java.util.Scanner;

public class Account {

    private int numero;
    private String titular;
    private double saldo;
    public double newDeposit;
    public double actualWithdraw ;
    Scanner sc = new Scanner(System.in);
    int selecao;

    public Account(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;

    }

    public Account(int numero, String titular, double initialDeposit) {
        this.numero = numero;
        this.titular = titular;
        deposit(initialDeposit);
    }

    public int getnumero() {

        return numero;
    }

    public String gettitular() {

        return titular;
    }

    public void settitular(String titular) {

        this.titular = titular;
    }

    public double getsaldo() {

        return saldo;
    }

    public void deposit(double amount) {

        saldo += amount;
    }

    public void withdraw(double amount) {

        saldo -= amount;

    }

    public String toString() {
        return "Conta Corrente "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);

    }


    public String mensagemFinal() {

        String mensagem = "Obrigado por utilizar o Java Bank" ;

        return mensagem;
    }

    public void blockWithdraw(double depositCorrecion){

        deposit(newDeposit);
    }

    public void selectedOperation(int selecao){



        if (selecao == 1) {

            System.out.println();
            System.out.print("Insira um valor de deposito: ");
            newDeposit = sc.nextDouble();
            deposit(newDeposit);

        } else if (selecao == 2) {

            if (saldo != 0.0) {

                System.out.println();
                System.out.print("Insira um valor de retirada: ");
                actualWithdraw = sc.nextDouble();
                withdraw(actualWithdraw);

            } else {

                System.out.println("Saque indisponivel, seu saldo:" + saldo);
                System.out.println("por favor realize um deposito, Insira um valor de depósito:");
                newDeposit = sc.nextDouble();
                blockWithdraw(newDeposit);

            }

        } else {

            tentativas();
        }
    }

    public void tentativas () {

        for (int i = 2; i >= 0; --i) {

            int tentativas = 0 ;

            System.out.println("Operação invalida");
            System.out.println();
            System.out.println("Qual operação gostaria de realizar? Digite: 1° deposito / 2° saque");
            System.out.println();

            selecao = sc.nextInt();

            if (selecao == 1) {

                System.out.println();
                System.out.print("Insira um valor de deposito: ");

                deposit(newDeposit);
                System.out.println("Dados da conta atualizados:");
                i = 0;
            } else if (selecao == 2) {

                if (saldo != 0.0) {

                    System.out.println();
                    System.out.print("Insira um valor de retirada: ");

                    withdraw(actualWithdraw);
                    System.out.println("Saque realizada com sucesso");
                    System.out.println("Saldo Atualizado: " + saldo);
                    System.out.println();
                    i = 0;

                } else {

                    System.out.println("Saque indisponivel, seu saldo:" + saldo);
                    System.out.println("por favor realize um deposito, Insira um valor de deposito:");
                    blockWithdraw(newDeposit);
                    System.out.println("Saldo Atualizado: " + saldo);
                    i = 0;
                }
            }
            tentativas += i ;
            System.out.println("Seleção invalida, você tem:" + tentativas + " tentativas");
            System.out.println();


        }

    }
}