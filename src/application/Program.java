package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Bem vindo ao JavaBank. ");

        System.out.println("Entre com o número da conta: ");
        int number = sc.nextInt();

        System.out.print("Entre com nome do titular: ");

        sc.nextLine();
/**
* Entrada de dados via teclado.
*
* */
        String holder = sc.nextLine();
        System.out.print("Existe um depósito inicial? (y/n)? ");

        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Insira o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Dados da sua conta:");
        System.out.println(account);

        System.out.println();

        System.out.println("Qual operação gostaria de realizar? Digite: 1° deposito / 2° saque");



        int selectoperation = sc.nextInt();


        if (selectoperation == 1) {

            System.out.println();
            System.out.print("Insira um valor de depósito: ");

            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            System.out.println("Dados da conta atualizados:");
            System.out.println(account);
            System.out.println();

        } else if (selectoperation == 2) {

            if (account.getsaldo() != 0.0) {

                System.out.println();
                System.out.print("Insira um valor de retirada: ");
                double withdrawValue = sc.nextDouble();
                account.withdraw(withdrawValue);
                System.out.println("Saque realizada com sucesso");
                System.out.println("Saldo Atualizado: " + account.getsaldo());
                System.out.println();
            } else {

                System.out.println("Saque indisponivel, seu saldo:" + account.getsaldo());
                System.out.println("por favor realize um deposito, Insira um valor de depósito:");
                double valueZeroAccount = sc.nextDouble();

                account.blockWithdraw(valueZeroAccount);
                System.out.println("Saldo Atualizado: " + account.getsaldo());

            }

        } else {

            for (int i = 1; i >= 0; --i) {

                System.out.println("Operação inválida");

                System.out.println("Qual operação gostaria de realizar? Digite: 1° deposito / 2° saque");
                System.out.println();

                selectoperation = sc.nextInt();

                if (selectoperation == 1) {

                    System.out.println();
                    System.out.print("Insira um valor de depósito: ");

                    double depositValue = sc.nextDouble();
                    account.deposit(depositValue);
                    System.out.println("Deposito realizado com sucesso");
                    System.out.println("Saldo Atualizado: " + account.getsaldo());
                    i = 0;
                } else if (selectoperation == 2) {

                    if (account.getsaldo() != 0.0) {

                        System.out.println();
                        System.out.print("Insira um valor de retirada: ");
                        double withdrawValue = sc.nextDouble();
                        account.withdraw(withdrawValue);
                        System.out.println("Saque realizada com sucesso");
                        System.out.println("Saldo Atualizado: " + account.getsaldo());
                        System.out.println();
                        i = 0;

                    } else {

                        System.out.println("Saque indisponivel, seu saldo:" + account.getsaldo());
                        System.out.println("por favor realize um deposito, Insira um valor de depósito:");
                        double valueZeroAccount = sc.nextDouble();

                        account.blockWithdraw(valueZeroAccount);
                        System.out.println("Saldo Atualizado: " + account.getsaldo());
                        i = 0;
                    }
                }
            }
        }
        account.alertFinal();
        System.out.println(account);

        sc.close();

    }

}