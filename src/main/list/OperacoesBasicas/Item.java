package main.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;


    public Item(String nome, double preco, int quantidade) {
        this.nome = this.nome;
        this.preco = this.preco;
        this.quantidade = this.quantidade;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString(){
        return "item{"+
                "nome='" + nome + '\''+
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}











