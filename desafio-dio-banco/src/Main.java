public class Main {
    public static void main(String[] args) {
        Banco bancoInicial = new Banco();
        bancoInicial.setNome("Banco inicial");

        Cliente keven = new Cliente("Keven", bancoInicial);



    }
}
