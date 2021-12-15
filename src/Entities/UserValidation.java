package Entities;

import java.util.Scanner;

public class UserValidation {

    public String userValided;
    public boolean UserCadastrado;
    public boolean senhaCadastrada;
    public String UserCadastred;
    public String SenhaCadastred;

    Scanner SC = new Scanner(System.in);

    public  String CadastroUser() {

        System.out.println("Cadastre Seu usuario");

        String UsuarioCadastrado = SC.nextLine();

        if (UsuarioCadastrado != null) {
            System.out.println("Seu Usuário: " + UsuarioCadastrado + ". Foi Cadastrado com sucesso!");
            this.UserCadastrado = true;
            this.UserCadastred = UsuarioCadastrado;
        }

        return this.UserCadastred;
    }

    public String CadastroSenha(){

        System.out.println("Cadastre Seu Senha");

        String SenhaCadastrada = SC.nextLine();

        if (SenhaCadastrada != null){
            System.out.println("Seu Senha " + SenhaCadastrada + ":Cadastrada com sucesso!");
            this.senhaCadastrada = true;
            this.SenhaCadastred = SenhaCadastrada;
        }
        return SenhaCadastred;
    }


    public String ValidacaoUser(String UsuarioCadastrado){


        System.out.println("Por favor Confirme Se Seu Usuario é Válidos");

        System.out.println("Digite o seu usuário Cadastrado!");

        String ConfirmUser = SC.nextLine();

        if (UsuarioCadastrado.equals(ConfirmUser)) {
            System.out.println("Usuario e Senha Válidos");
            this.userValided = "valido";
        } else {
            System.out.println("Usuario  Inválidos.");

            for(int i = 1; i >= 0; --i) {
                System.out.println("Digite o seu usuário Cadastrado!");
                ConfirmUser = SC.nextLine();
                  if (UsuarioCadastrado.equals(ConfirmUser)) {
                    System.out.println("Usuario Válidos");
                    System.out.println("Acesso permitido");
                    this.userValided = "valido";
                    i = 0;
                } else {
                    System.out.println("Você tem: " + i + " tentativas");
                    if (i == 0) {
                        System.out.println("Suas tentativas acabaram usuario e senha bloqueados!");
                        System.out.println("Por favor enviar email para: Jnasci50@gmail.com e recupere o seu acesso ao sistema.");
                        this.userValided = "bloqueado";
                    }
                }
            }
        }

        return userValided;
    }

    public String ValidacaoSenha(String SenhaCadastrada){

        System.out.println("Por favor Confirme Sua Senha Estão Válidos");

        System.out.println("Digite a seu Senha Cadastrada!");

        String ConfirmSenha = SC.nextLine();

        if (SenhaCadastrada.equals(ConfirmSenha)) {
            System.out.println("Senha Válidos");
            this.userValided = "valido";
        } else {
            System.out.println("Senha Inválidos.");

            for(int i = 1; i >= 0; --i) {
                System.out.println("Digite o seu usuário Cadastrado!");
                System.out.println("Digite a seu Senha Cadastrada!");
                ConfirmSenha = SC.nextLine();
                if (SenhaCadastrada.equals(ConfirmSenha)) {
                    System.out.println("Senha Válidos");
                    System.out.println("Acesso permitido");
                    this.userValided = "valido";
                    i = 0;
                } else {
                    System.out.println("Você tem: " + i + " tentativas");
                    if (i == 0) {
                        System.out.println("Suas tentativas acabaram usuario e senha bloqueados!");
                        System.out.println("Por favor enviar email para: Jnasci50@gmail.com e recupere o seu acesso ao sistema.");
                        this.userValided = "bloqueado";
                    }
                }
            }
        }

        return userValided;

    }

}
