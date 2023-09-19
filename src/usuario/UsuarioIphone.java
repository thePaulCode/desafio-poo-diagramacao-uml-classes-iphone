package usuario;

import aparelhoIphone.Iphone;
//import reprodutormusical.*;
//import aparelhoTelefonico.*;
//import navegadorInternet.*;

public class UsuarioIphone {
    public static void main(String[] args) {
        // Instanciar objeto iphone do usuário
        Iphone meuIphone = new Iphone();

        // Tocar música
        meuIphone.tocar();

        // Pausar música
        meuIphone.pausar();

        // Selecionar música
        meuIphone.selecionarMusica();

        // Ligar para contato
        meuIphone.ligar();

        // Atender ligação
        meuIphone.atender();

        // Iniciar correio de voz
        meuIphone.iniciarCorreioVoz();

        // Exibir página de internet
        meuIphone.exibirPagina();

        // Adicionar nova aba de navegação
        meuIphone.adicionarNovaAba();

        // Atualizar página
        meuIphone.atualizarPagina();


    }
}
