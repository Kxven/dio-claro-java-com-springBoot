import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoDeMensagemInstatanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoDeMensagemInstatanea smi = null;
        String appEscolhido = "msn";
        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
