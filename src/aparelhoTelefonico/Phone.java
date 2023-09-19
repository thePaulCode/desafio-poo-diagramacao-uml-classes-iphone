package aparelhoTelefonico;

public class Phone implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Ligando para contato...");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz...");

    }
}
