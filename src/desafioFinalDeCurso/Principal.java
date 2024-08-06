package desafioFinalDeCurso;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Instância da classe Scanner passando System.in como argumento
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");

        //Realiza a leitura do que foi digitado pelo usuário e armazena na variável limite
        double limite = leitura.nextDouble();
        //Limpa o buffer do scanner para evitar problemas ao ler a próxima linha
        leitura.nextLine();
        //Cria um novo objeto CartaoDeCredito utilizando o limite fornecido pelo usuário.
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while (sair != 0) {
            System.out.println("Digite a descrição da compra:");
            //Realiza a leitura do que foi digitado pelo usuário e armazena na variável descricao
            String descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();
            //Limpa o buffer do scanner para evitar problemas ao ler a próxima linha
            leitura.nextLine();

            Compra compra = new Compra(descricao, valor);

            //Registra a compra no cartão de crédito e armazena o resultado na variável 'compraRealizada'
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();

                //Limpa o buffer do scanner para evitar problemas ao ler a próxima linha
                leitura.nextLine();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        //Ordena a lista de compras em ordem crescente de acordo com o método compareTo
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
    }
}
