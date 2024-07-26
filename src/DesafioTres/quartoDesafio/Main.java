package DesafioTres.quartoDesafio;


public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(8.0);
        Forma quadrado = new Quadrado(5.0);

        System.out.println("Essa é a área do circulo: " + circulo.calcularArea());
        System.out.println("Essa é a área do quadrado: " + quadrado.calcularArea());
    }
}
