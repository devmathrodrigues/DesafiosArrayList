package DesafioQuatro.terceiroDesafio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("item A");
        lista.add("item B");
        lista.add("item C");

        System.out.println("Mostrando a lista sem o uso do for: " + lista);

        List<String> outraLista = new LinkedList<>();
        outraLista.add("item A");
        outraLista.add("item B");
        outraLista.add("item C");

        System.out.println("Mostrando a lista com o uso do loop for: ");
        for (String item : lista){
            System.out.println(item);
        }

    }

}
