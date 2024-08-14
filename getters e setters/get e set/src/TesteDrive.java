public class TesteDrive {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        v1.setCor("Branco");
        v1.setMarca("Volks"); 
        v1.setModelo("Fox");
        v1.setnPassageiros(5);
        v1.setQtLitros(0);

        v2.setCor("Azul");
        v2.setMarca("GM"); 
        v2.setModelo("Spin");
        v2.setnPassageiros(7);
        v2.setQtLitros(0);
        
        System.out.println("Veiculo 1, Marca: "+ v1.getMarca()+ " Cor: " + v1.getCor()+ " Modelo: " + v1.getModelo() + " Numero de Passageiros : " + v1.getnPassageiros() + " Quantidade de litros de gasolina: " + v1.getQtLitros() + " Litros");
        System.out.println("Veiculo 1, Marca: "+ v2.getMarca()+ " Cor: " + v2.getCor()+ " Modelo: " + v2.getModelo() + " Numero de Passageiros : " + v2.getnPassageiros() + " Quantidade de litros de gasolina: " + v2.getQtLitros() + " Litros");

        if(v1.getQtLitros() == 0){
            v1.setQtLitros(30);
            System.out.println("O veiculo 1 passou no posto e abasteceu " + v1.getQtLitros() + " Litros");
        }
        if(v2.getQtLitros() == 0){
            v2.setQtLitros(30);
            System.out.println("O veiculo 1 passou no posto e abasteceu " + v2.getQtLitros() + " Litros");
        }
    }
}
