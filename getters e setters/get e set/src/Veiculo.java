public class Veiculo {
    private String cor;
    private String marca;
    private String Modelo;
    private int nPassageiros;
    private int qtLitros;

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public int getnPassageiros() {
        return nPassageiros;
    }
    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }
    public int getQtLitros() {
        return qtLitros;
    }
    public void setQtLitros(int qtLitros) {
        this.qtLitros = qtLitros;
    }
}