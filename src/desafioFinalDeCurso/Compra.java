package desafioFinalDeCurso;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @java.lang.Override
    public String toString() {
        return "desafioFinalDeCurso.Compra: " + "descricao = " + descricao + " valor =" + valor;
    }
    @Override
    public int compareTo(Compra outraCompra) {
        // Comparação dos valores das compras
        return Double.compare(this.valor, outraCompra.valor);
    }
}
