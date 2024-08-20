package br.com.guilhermevillaca.poo.agosto.atv3;

/**
 *
 * @author 10380
 */
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{"
                + "nome='" + nome + '\''
                + ", preco=" + preco
                + ", quantidadeEstoque=" + quantidadeEstoque
                + '}';
    }
}
