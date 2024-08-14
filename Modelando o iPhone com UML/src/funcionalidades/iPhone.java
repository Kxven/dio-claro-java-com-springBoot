package funcionalidades;

public class iPhone implements NavegadorNaInternet, AparelhoEletronico, ReprodutorMusical{

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Navegador do iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo URL: " + url + " no iPhone");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo no iPhone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone");
        
    }

    @Override
    public void ligar() {
        System.out.println("iPhone Ligando...");
    }

    @Override
    public void Pausar() {
        System.out.println("Pausando Musica no iPhone...");
        
    }

    @Override
    public void Selecionar(String nomeMusica) {
        System.out.println("Selecionado a musica : " + nomeMusica + " no iPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musicano Iphone");
    }
}
