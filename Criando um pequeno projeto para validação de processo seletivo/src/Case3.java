import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Case3 {
    public static void main(String[] args) {
        // selecaoCandidatos();
        // imprimirSelecionados();
        String [] candidatos = {"FELIPE","MARCIA","PAULO","JULIA","AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("contato realizado com sucesso");
            }

        }while(continuarTentando && tentativasRealizadas <3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA" + tentativasRealizadas + " TENTATIVA");
        }else{
            System.out.println("NAO COSEGUIMOS CONTATO COM  " + candidato + " NUMERO MAXIMO DE TANTATIVAS REALIZADAS");
        }
    }
    //Método auxiliar para caso seja atendido o celular
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","PAULO","JULIA","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento ");
        // for(int indice = 0;indice < candidatos.length; indice++){
        //     System.out.println("O candidato de n : " + (indice+1) + " " + candidatos[indice]);
        // }
        //ForEach
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi o " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","PAULO","JULIA","AUGUSTO","MONICA","FABRICIO","IRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();
                System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                if(salarioBase > salarioPretendido){
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                    candidatosSelecionados ++;
                }
                candidatosAtual++;
            }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
           if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
