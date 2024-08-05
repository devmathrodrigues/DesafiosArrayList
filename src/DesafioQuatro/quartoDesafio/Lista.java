package DesafioQuatro.quartoDesafio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //Declarando váriavel list para fazer uso de polimorfismo do desafio anterior.
        List<String> list;

        list = new ArrayList<>();
        list.add("item A");
        list.add("item B");
        list.add("item C");

        System.out.println("Mostrando a lista sem o uso do for: " + list);

        list = new LinkedList<>();
        list.add("item A");
        list.add("item B");
        list.add("item C");

        System.out.println("Mostrando a lista com o uso do loop for: ");
        for (String item : list){
            System.out.println(item);
        }
    }
}