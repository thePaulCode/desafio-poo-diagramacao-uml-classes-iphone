package navegadorInternet;

public class Safari implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibir página de navegação");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba de navegação");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página de navegação");

    }
}
