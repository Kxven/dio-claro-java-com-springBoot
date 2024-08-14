package apps;
public abstract class ServicoDeMensagemInstatanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validaConectardoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    // private void validaConectardoInternet(){
    //     System.out.println("Validando se está conctado a internet");
    // }
    // private void salvarHistoricoMensagem(){
    //     System.out.println("Salvando o histórico de Mensagem");
    // }   
}
