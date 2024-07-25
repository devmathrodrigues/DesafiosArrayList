package DesafioTres.segundoDesafio;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal () {
        this.nome = "Joaquim";
        this.especie = "Cachorro";
        this.idade = 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // método criado para imprimir as características
    public void mostraCaracteristicas() {
        System.out.println("Nome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Idade: " + idade + " anos");
    }
}
