package DesafioTres.terceiroDesafio;

import java.util.ArrayList;

//Declarando propriedade da classe Produto
public class Produto {
    private String nome;
    private double preco;

    //Iniciando o construtor da classe Produto
    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Adicionando o método get de preco para acessar o seu valor fora da classe Produto
    public double getPreco() {
        return preco;
    }
}
