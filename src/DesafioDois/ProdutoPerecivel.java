package DesafioDois;

public class ProdutoPerecivel extends Produto {
    public String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(
                "Aguarrás", 40.3, 1, "23/07/2024"
        );
        System.out.println(produtoPerecivel);

    }
}


