package DesafioQuatro.segundoDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Titulo implements Comparable{
    private String nome;

    //Iniciando um construtor
    public Titulo(String nome){
        this.nome = nome;
    }

    //Implementção do método ComparaTo da interface Comparable
    @Override
    public int compareTo(Object outroTitulo) {
        return this.nome.compareTo(outroTitulo.toString());
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public static void main(String[] args) {
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("The Shinning"));
        titulos.add(new Titulo("The Office"));
        titulos.add(new Titulo("Black List"));
        titulos.add(new Titulo("Doctor House"));

        System.out.println("Lista fora de ordem: " + titulos);

        Collections.sort(titulos);

        System.out.println("Lista em ordem crescente: " + titulos);
    }
}
