package DesafioTres.primeiroDesafio;

import java.util.ArrayList;

// Criando um ArrayList de strings e utilizando um loop foreach para percorrer e imprimir cada elemento da lista.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Caneta");
        listaStrings.add("Lápis");
        listaStrings.add("Borracha");


        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }
    }
}
