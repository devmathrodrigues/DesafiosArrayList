package DesafioQuatro.primeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaLista {
    public static void main(String[] args) {
        //Criando lista de números inteiros
        List<Integer> numeros = new ArrayList<>();
        //Adicionando números a lista
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(2);

        System.out.println("Lista fora de ordem: " + numeros);

        //Colocando a lista em ordem crescente com o método Collections.sort
        Collections.sort(numeros);

        System.out.println("Lista em ordem crescente: " + numeros);
    }
}
