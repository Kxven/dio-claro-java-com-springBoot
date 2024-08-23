package mainJava.list.operaçõesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);

        // carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!carrinho.isEmpty()){
            for (Item i : carrinho) {
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }
        itemsParaRemover.removeAll(itemsParaRemover);
        }else{
            System.out.println("O carrinho está vazio!");
        }
    }


    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if(!carrinho.isEmpty()){
            for (Item item : carrinho) {
                double valorItems = item.getPreco() * item.getQuantidade();
                valorTotal += valorItems;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItems(){
        if(!carrinho.isEmpty()){
            System.out.println(this.carrinho);
        }else{
            System.out.println("A lista está vazia!");
        }
    }    
    public String toString() {
        return "CarrinhoDeCompras{" +
            "itens=" + carrinho +
            '}';
      }

    public static void main(String[] args) {
        CarrinhoDeCompras meusItems = new CarrinhoDeCompras();
        meusItems.exibirItems();
        meusItems.adicionarItem("Bolacha", 5.0, 2);
        meusItems.adicionarItem("Arroz", 20.0, 1);

        meusItems.exibirItems();
        
        meusItems.removerItem("bolacha");
        meusItems.exibirItems();

        System.out.println("O valor total da compra é = " + meusItems.calcularValorTotal());
    }
}
