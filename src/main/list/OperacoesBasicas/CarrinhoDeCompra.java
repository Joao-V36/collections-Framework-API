package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> CarrinhoCompra;

    public CarrinhoDeCompra(){
        this.CarrinhoCompra = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        CarrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        if (!CarrinhoCompra.isEmpty()) {

            for (Item i : CarrinhoCompra) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemRemover.add(i);
                }
            }
            CarrinhoCompra.removeAll(itemRemover);

        }else {
            System.out.println("A lista está vazia");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!CarrinhoCompra.isEmpty()) {
            for (Item item : CarrinhoCompra) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!CarrinhoCompra.isEmpty()) {
            System.out.println(this.CarrinhoCompra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public String toString(){
        return "CarrinhoDeCompra{" +
                "itens=" + CarrinhoCompra +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        // Adicionando itens ao carrinho
        carrinhoDeCompra.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompra.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompra.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompra.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompra.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompra.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompra.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompra.calcularValorTotal());
    }




    }

