package DesafioTres.quartoDesafio;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
