package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Entre com o número da conta: ");
        int number = sc.nextInt();
        System.out.print("Entre com nome do titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Existe um depósito inicial? (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Insira o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(account);

        System.out.println();
        System.out.print("Insira um valor de depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Dados da conta atualizados:");
        System.out.println(account);

        System.out.println();

        System.out.println("Gostaria de realizar um saque. (y/n)?");

        char responseSaque = sc.next().charAt(0);

        if (responseSaque == 'y')  {

            System.out.println();
            System.out.print("Insira um valor de retirada: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);
            System.out.println("Saque realizada com sucesso");
            System.out.println("Saldo Atualizado: " + account.getsaldo());
            System.out.println();

        }

        System.out.println("Obrigado por utilizar o JavaBank:");
        System.out.println();
        System.out.println("Dados atualizados da sua conta:");
        System.out.println(account);

        sc.close();
    }
}