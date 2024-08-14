package apps;
public class MSNMessenger extends ServicoDeMensagemInstatanea{
    public void enviarMensagem(){
        validaConectardoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo MSN");
    }
}
