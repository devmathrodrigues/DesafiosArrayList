package DesafioDois;

import java.util.ArrayList;

public class  Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Criando o construtor para inicializar os objetos já criados.
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public static void main(String[] args){
        Produto produtoNovo = new Produto("Sabão em pó", 30.0, 1);
        System.out.println(produtoNovo);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produtoUm = new Produto("Esponja", 1.25, 1);
        Produto produtoDois = new Produto("Detergente", 10.50, 5);
        Produto produtoTres = new Produto("Desinfetante", 15.00, 1);
        Produto produtoQuatro = new Produto("Desengordurante", 17.00, 1);

        listaDeProdutos.add(produtoUm);
        listaDeProdutos.add(produtoDois);
        listaDeProdutos.add(produtoTres);
        listaDeProdutos.add(produtoQuatro);

        System.out.println("O tamanho da lista é: " + listaDeProdutos.size());

        System.out.println("Recuperando o produto pelo indice: " + listaDeProdutos.get(1).getNome());

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
