import telefone.IPhone;
import telefone.Telefone;

public class Main {
    public static void main(String[] args) {
        Telefone telefone = new IPhone();

        telefone.ligar("11 9 0000 - 0000");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println();

        telefone.exibirPagina("https://github.com/fertilesoil");
        telefone.adicionarNovaAba();
        telefone.atualizarPagina();
        System.out.println();

        telefone.selecionarMusica("The Warning - Survive");
        telefone.tocar();
        telefone.pausar();
    }
}