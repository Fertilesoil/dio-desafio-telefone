package telefone;

import telefone.aplicativos.AparelhoTelefonico;
import telefone.aplicativos.Navegador;
import telefone.aplicativos.ReprodutorMusical;

public abstract class Telefone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    @Override
    public void ligar(String numero) {
        System.out.println("Discando o número " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegando para a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Você escolheu a música: " + musica + "...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }
}
