package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Entities.UserValidation;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /**Declaração dos Objetos apartir das classes Account e UsserValidation*/

        Account account;
        UserValidation usuario;

        /**Declaração de Variaveis Globais para confirmação de usuario e senha*/

        String confirmarUsario = " ";
        String confirmarSenha = " ";

        /**Inicio da interação com o correntista*/

        System.out.print("Bem vindo ao JavaBank. O seu Banco Digital.");
        System.out.println();

        System.out.println("Por Favor Cadastre Seu Usuario.");
        String cadastrarUsuario = sc.nextLine();

        System.out.println("Por Favor Cadastre Seu Senha.");
        String cadastrarSenha = sc.nextLine();

        /**Criação do objeto usuario*/

        usuario = new UserValidation(cadastrarUsuario,cadastrarSenha);

        /**Camada do método para cadastro de usuario*/

        usuario.CadastrarUsario(usuario.getCadastroUsuario());

        /**Camada do método para cadastro de usuario*/

        usuario.CadastrarSenha(usuario.getCadastroSenha());

        System.out.println("Confirme seu usuario");

        confirmarUsario = sc.nextLine();

        System.out.println("Confirme sua Senha");

        confirmarSenha = sc.nextLine();

        /**Camada do método para confirmar de validação do usuario, após cadastramento.*/

        if (usuario.getUsuarioCadastrado()){

            usuario.ValidarUsuario(usuario.getValidarUsuario(), confirmarUsario);
        }

        /**Camada do método para confirmar de validação de senha, após cadastramento.*/

        if (usuario.getSenhaCadastrada()){

            usuario.ValidacaoSenha(usuario.getValidarSenha(),confirmarSenha);
        }


        /** Apos cadastro e confirmação do dados. Exibição dos dados da Conta. */


        int number = Account.numeroConta();

        System.out.println("Este é o seu número de Conta: " + number);


        System.out.println("Titular da Conta: " + usuario.getValidarUsuario());


        String holder = usuario.getValidarUsuario();


        /** 2º Oportunidade de Confirmações caso aconteca digitação errada de dados pelo usuario*/

        if (!usuario.getUsuarioValidado() && !usuario.getSenhaValidada()){

            System.out.println("Por favor Valide Seus dados pela 2° vez");
            usuario.ValidarUsuario(usuario.getValidarUsuario(), confirmarUsario);
            usuario.ValidacaoSenha(usuario.getValidarSenha(),confirmarSenha);
        }

        /** Dados Corretos Chamada da classe Account*/
        else {

            System.out.print("Existe um deposito inicial? (y/n)? ");

            char response = sc.next().charAt(0);

            if (response == 'y') {
                System.out.print("Insira o valor do deposito inicial: ");
                double initialDeposit = sc.nextDouble();
                account = new Account(number, holder, initialDeposit); /*Construtos com 3 atributos */
            } else {
                account = new Account(number, holder); /*Construtos com 2 atributos */
            }

            System.out.println();
            System.out.println("Dados da sua conta:");
            System.out.println(account); /*Exibição dos dados da conta atualizados */

            System.out.println();

            System.out.println("Qual operação gostaria de realizar? Digite: 1° deposito / 2° saque");

            int select = sc.nextInt();

            account.selectedOperation(select); /*Seleção de operações pelo usuario */
            System.out.println(account);
            System.out.println(account.mensagemFinal()); /*messagem final do programa */

        }

        sc.close();

    }

}
