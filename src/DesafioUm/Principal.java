package DesafioUm;

import DesafioUm.Pessoa;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args){
        //Comando padrão ao criar um ArrayList
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //Declarando objetos com nome e idade
        Pessoa pessoaUm = new Pessoa("João",22);
        Pessoa pessoaDois = new Pessoa("Henrique", 25);
        Pessoa pessoaTres = new Pessoa("Clarice", 19);

        //Adicionando pessoas a lista utilizando o método Add
        listaDePessoas.add(pessoaUm);
        listaDePessoas.add(pessoaDois);
        listaDePessoas.add(pessoaTres);

        //Mostrando na tela o tamanho da lista utilizando o método Size
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        //Mostrando somente a primeira pessoa da lista utilizando o método Get
        System.out.println("Primeira pessoa da lista é: " + listaDePessoas.get(0));

        //Mostrando a lista completa
        System.out.println("Aqui está a lista de pessoas completa: " + listaDePessoas);

    }
}
