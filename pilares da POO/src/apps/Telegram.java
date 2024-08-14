package apps;

public class Telegram extends ServicoDeMensagemInstatanea {
    public void enviarMensagem(){
        validaConectardoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo Telegram");
    }
}
