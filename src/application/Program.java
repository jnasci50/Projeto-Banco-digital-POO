package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Entities.UserValidation;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Account account;
        UserValidation usuario;

        String confirmarUsario = " ";
        String confirmarSenha = " ";


        System.out.print("Bem vindo ao JavaBank. ");
        System.out.println();
        System.out.println("Cadastre Seu usuario");
        String cadastrarUsuario = sc.nextLine();
        System.out.println("Cadastre Seu Senha");
        String cadastrarSenha = sc.nextLine();

        usuario = new UserValidation(cadastrarUsuario,cadastrarSenha);

usuario.

        confirmarUsario = sc.nextLine();


        if (usuario.getUsuarioCadastrado()){

            usuario.ValidarUsuario(usuario.getValidarUsuario(), confirmarUsario);

        }





        System.out.println("Entre com o numero da conta: ");

        int number = sc.nextInt();

        System.out.print("Entre com nome do titular: ");

        sc.nextLine();
/**
 * Entrada de dados via teclado.
 *
 * */
        String holder = usuario.getValidarUsuario();

        System.out.print("Existe um deposito inicial? (y/n)? ");

        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Insira o valor do deposito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Dados da sua conta:");
        System.out.println(account);

        System.out.println();

        System.out.println("Qual opera��o gostaria de realizar? Digite: 1° deposito / 2° saque");

        int select = sc.nextInt();

        account.selectedOperation(select);
        System.out.println(account);
        System.out.println(account.mensagemFinal());

        sc.close();

    }

}
