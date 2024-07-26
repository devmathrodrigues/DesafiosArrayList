package DesafioTres.terceiroDesafio;

import java.util.ArrayList;

public class Main {
    //Criando um ArrayList da classe Produto, e consequentemente adicionando novos objetos que irão
    //ser adicionandos dentro dessa lista para calcular a média dos precos
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto primeiroProduto = new Produto("Enxaguante Bucal", 10.99);
        Produto segundoProduto = new Produto("Pasta de Dente", 2.30);
        Produto terceiroProduto = new Produto("Escova de Dentes", 13.25);

        listaDeProdutos.add(primeiroProduto);
        listaDeProdutos.add(segundoProduto);
        listaDeProdutos.add(terceiroProduto);

        double somaPrecos = 0.0;
        for (Produto produto : listaDeProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaDeProdutos.size();

        System.out.println("O preço médio dos produtos listado nas lista é de: " + precoMedio);
    }
}
