package Entities;

import java.util.Scanner;

public class UserValidation {

    private String cadastroUsuario;
    private String cadastroSenha;

    private boolean usuarioCadastrado;
    private boolean senhaCadastrada;

    private String validarUsuario;
    private String validarSenha;

    private boolean usuarioValidado;
    private boolean senhaValidada;

    Scanner sc = new Scanner(System.in);

    public UserValidation(String cadastroUsuario, String cadastroSenha) {
        this.cadastroUsuario = cadastroUsuario;
        this.cadastroSenha = cadastroSenha;

    }

    public void setCadastroUsuario(String cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }

    public void setCadastroSenha(String cadastroSenha) {
        this.cadastroSenha = cadastroSenha;
    }

    public void setUsuarioCadastrado(boolean usuarioCadastrado) {

        this.usuarioCadastrado = usuarioCadastrado;
    }

    public String getCadastroUsuario() {

        return cadastroUsuario;
    }

    public String getCadastroSenha() {

        return cadastroSenha;
    }

    public boolean getUsuarioCadastrado() {

        return usuarioCadastrado;
    }

    public boolean getSenhaCadastrada() {

        return senhaCadastrada;
    }

    public String getValidarUsuario() {

        return validarUsuario;
    }

    public String getValidarSenha() {

        return validarSenha;
    }

    public boolean getUsuarioValidado() {

        return usuarioValidado;
    }

    public boolean getSenhaValidada() {

        return senhaValidada;
    }


    //*inicio declaração dos Metodos da Class*/


    public String CadastrarUsario(String cadastroUsuario) {

        if (cadastroUsuario != null) {
            System.out.println("Seu Usuário: " + cadastroUsuario + ". Foi Cadastrado com sucesso!");
            this.usuarioCadastrado = true;
            this.validarUsuario = cadastroUsuario;
        }

        return validarUsuario;
    }


    public String CadastrarSenha(String cadastroSenha) {

        if (cadastroSenha != null) {
            System.out.println("Seu Senha " + cadastroSenha + ":Cadastrada com sucesso!");
            this.senhaCadastrada = true;
            this.validarSenha = cadastroSenha;
        }
        return validarSenha;
    }


    public boolean ValidarUsuario(String validarUsuario, String confirmarUsuario) {


       // System.out.println("Por favor Confirme Se Seu Usuario é Válidos");

       // System.out.println("Digite o seu usuário Cadastrado!");


        if (validarUsuario.equals(confirmarUsuario)) {
            System.out.println("Usuario Válido");
            this.usuarioValidado = true;
        } else {
            System.out.println("Usuario  Inválidos.");
            this.usuarioValidado = false;

            confirmarUsuario = "";

            for (int i = 1; i >= 0; --i) {
                System.out.println("Digite o seu usuário Cadastrado!");

                confirmarUsuario = sc.nextLine();

                if (validarUsuario.equals(confirmarUsuario)) {
                    System.out.println("Usuario Válido");
                    System.out.println("Acesso permitido");
                    this.usuarioValidado = true;
                    i = 0;
                } else {
                    System.out.println("Você tem: " + i + " tentativas");
                    if (i == 0) {
                        System.out.println("Suas tentativas acabaram usuario e senha bloqueados!");
                        System.out.println("Por favor enviar email para: Jnasci50@gmail.com e recupere o seu acesso ao sistema.");

                    }
                }
            }
        }

        return usuarioValidado;
    }

    public boolean ValidacaoSenha(String validarSenha, String ConfirmarSenha) {

       // System.out.println("Por favor Confirme Sua Senha Estão Válidos");

       // System.out.println("Digite a seu Senha Cadastrada!");


        if (validarSenha.equals(ConfirmarSenha)) {
            System.out.println("Senha Válidas");
            this.senhaValidada = true;
        } else {
            System.out.println("Senha Inválidas.");

            ConfirmarSenha = "";

            for (int i = 1; i >= 0; --i) {

                System.out.println("Digite a seu Senha Cadastrada!");

                ConfirmarSenha = sc.nextLine();

                if (validarSenha.equals(ConfirmarSenha)) {
                    System.out.println("Senha Válidas");
                    System.out.println("Acesso permitido");
                    this.senhaValidada = true;
                    i = 0;
                } else {
                    System.out.println("Você tem: " + i + " tentativas");
                    if (i == 0) {
                        System.out.println("Suas tentativas acabaram usuario e senha bloqueados!");
                        System.out.println("Por favor enviar email para: Jnasci50@gmail.com e recupere o seu acesso ao sistema.");
                        this.senhaValidada = false;
                    }
                }
            }
        }

        return senhaValidada;

    }

}
