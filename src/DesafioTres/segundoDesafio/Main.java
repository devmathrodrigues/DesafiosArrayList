package DesafioTres.segundoDesafio;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        //Adicionando verificação se o objeto é do tipo Animal para realizar o casting
        if(cachorro instanceof Animal) {
            //Casting para a classe Animal
            Animal animal = (Animal) cachorro;
            animal.mostraCaracteristicas();
        } else {
            System.out.println("Objeto não é do tipo Animal");
        }
    }
}