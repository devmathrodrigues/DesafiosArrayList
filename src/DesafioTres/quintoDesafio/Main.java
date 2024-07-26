package DesafioTres.quintoDesafio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria(12345, 3500);
        ContaBancaria segundaConta = new ContaBancaria(16789, 800.35);
        ContaBancaria terceiraConta = new ContaBancaria(26583, 5200);

        ArrayList<ContaBancaria> listaDeContasBancarias = new ArrayList<>();
        listaDeContasBancarias.add(primeiraConta);
        listaDeContasBancarias.add(segundaConta);
        listaDeContasBancarias.add(terceiraConta);

        ContaBancaria contaComOMaiorSaldo = listaDeContasBancarias.get(2);

        for (ContaBancaria conta : listaDeContasBancarias) {
            if (conta.getSaldo() > contaComOMaiorSaldo.getSaldo()) {
                contaComOMaiorSaldo = conta;
            }
        }

        System.out.println("A conta com maior saldo é a de Número " + contaComOMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaComOMaiorSaldo.getSaldo());
    }
}
