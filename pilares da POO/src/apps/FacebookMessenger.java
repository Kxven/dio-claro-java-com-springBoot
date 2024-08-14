package apps;

public class FacebookMessenger extends ServicoDeMensagemInstatanea{
    public void enviarMensagem(){
        validaConectardoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo Facebook");
    }
}
