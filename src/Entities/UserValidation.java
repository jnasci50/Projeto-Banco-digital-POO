package Entities;

public class UserValidation {

    private String cadastroUsuario;
    private String cadastroSenha;

    private boolean usuarioCadastrado;
    private boolean senhaCadastrada;

    private String validarUsuario;
    private String validarSenha;

    private boolean usuarioValidado;
    private boolean senhaValidada;

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


    public String CadastrarSenha(String cadastroSenha){

        if (cadastroSenha != null){
            System.out.println("Seu Senha " + cadastroSenha + ":Cadastrada com sucesso!");
            this.cadastroSenha = true;
            this.validarSenha = cadastroSenha;
        }
        return validarSenha;
    }



    public String ValidarUsuario(String validarUsuario, String confirmarUsuario){


        System.out.println("Por favor Confirme Se Seu Usuario é Válidos");

        System.out.println("Digite o seu usuário Cadastrado!");



        if (validarUsuario.equals(confirmarUsuario)) {
            System.out.println("Usuario e Senha Válidos");
             this.validarUsuario = "valido";
        } else {
            System.out.println("Usuario  Inválidos.");

            for(int i = 1; i >= 0; --i) {
                System.out.println("Digite o seu usuário Cadastrado!");

                  if (validarUsuario.equals(confirmarUsuario)) {
                    System.out.println("Usuario Válidos");
                    System.out.println("Acesso permitido");
                    this.validarUsuario = "valido";
                    i = 0;
                } else {
                    System.out.println("Você tem: " + i + " tentativas");
                    if (i == 0) {
                        System.out.println("Suas tentativas acabaram usuario e senha bloqueados!");
                        System.out.println("Por favor enviar email para: Jnasci50@gmail.com e recupere o seu acesso ao sistema.");
                        this.validarUsuario = "bloqueado";
                    }
                }
            }
        }

        return usuarioValidado;
    }

    public String ValidacaoSenha(String validarSenha, String ConfirmarSenha){

        System.out.println("Por favor Confirme Sua Senha Estão Válidos");

        System.out.println("Digite a seu Senha Cadastrada!");



        if (validarSenha.equals(ConfirmarSenha)) {
            System.out.println("Senha Válidos");
            this.cadastroSenha = "valido";
        } else {
            System.out.println("Senha Inválidos.");

            for(int i = 1; i >= 0; --i) {
                System.out.println("Digite o seu usuário Cadastrado!");
                System.out.println("Digite a seu Senha Cadastrada!");

                if (validarSenha.equals(ConfirmarSenha)) {
                    System.out.println("Senha Válidos");
                    System.out.println("Acesso permitido");
                    this.usuarioValidado = "valido";
                    i = 0;
                } else {
                    System.out.println("Você tem: " + i + " tentativas");
                    if (i == 0) {
                        System.out.println("Suas tentativas acabaram usuario e senha bloqueados!");
                        System.out.println("Por favor enviar email para: Jnasci50@gmail.com e recupere o seu acesso ao sistema.");
                        this.usuarioValidado = "bloqueado";
                    }
                }
            }
        }

        return senhaValidada;

    }

}
