package aparelhoIphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;


public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void tocar() {

        System.out.println("Tocar música via Iphone...");

    }

    @Override
    public void pausar() {
        System.out.println("Pausar música via Iphone...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música via Iphone...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página via Iphone...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba via Iphone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página via Iphone...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para contato via Iphone...");

    }

    @Override
    public void atender() {
        System.out.println("Atender ligação via Iphone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz via Iphone...");

    }
}
