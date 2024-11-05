import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta implements iCOnta{

        private static final int AGENCIA_PADRAO = 1;
        private static int SEQUENCIAL = 1;

        protected int agencia;
        protected int numero;
        protected double saldo = 0D;
        private Cliente cliente;
        private List<String> historico;
        private List<String> contasCriadas;

        public Conta(Cliente cliente){
            this.agencia = AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.cliente = cliente;
            this.historico = new ArrayList<>();
            this.contasCriadas = new ArrayList<>();
        }


        public int getAgencia() {
            return agencia;
        }
        public int getNumero() {
            return numero;
        }
        public double getSaldo() {
            return saldo;
        }


    protected void imprimirInfoComuns() {
        System.out.println(String("Titular : %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia : %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(historico);
    }


    public void sacar(double valor) {
        if(saldo>=valor){
            saldo -= valor;
            historico.add(String.format("Saque de %.2f em %s", valor, java.time.LocalDate.now()));
        }else{
            System.out.println("Saldo insuficiente!");
        }

    };
    public void depositar(double valor) {
        if(valor >=0.1){
            saldo += valor;
            historico.add(String.format("Foram depositados na conta %.2f em %s ", valor, java.time.LocalDate.now()));
        }else{
            System.out.println("Valor menor que o permitido!");
        }
    };

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        historico.add(String.format("Transferência de %.2f em %s", valor, java.time.LocalDate.now()));
    };

    }

