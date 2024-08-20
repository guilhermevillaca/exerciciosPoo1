package br.com.guilhermevillaca.poo.agosto.atv1;

/**
 *
 * @author 10380
 */
public class Imovel {

    // Atributos
    private String nomeProprietario;
    private String endereco;
    private double valorCompra;
    private int anoConstrucao;

    // Construtor
    public Imovel(String nomeProprietario, String endereco, double valorCompra, int anoConstrucao) {
        this.nomeProprietario = nomeProprietario;
        this.endereco = endereco;
        this.valorCompra = valorCompra;
        this.anoConstrucao = anoConstrucao;
    }

    // Método para calcular o valor de venda
    public double calcularValorVenda(int anoVenda, double taxaCorrecaoMonetaria) {
        int anosPassados = anoVenda - anoConstrucao;
        double valorFinal = valorCompra;

        // Aplica acréscimo de 2% por ano
        for (int i = 0; i < anosPassados; i++) {
            valorFinal += valorFinal * 0.02;
        }

        // Aplica a taxa de correção monetária
        valorFinal += valorFinal * (taxaCorrecaoMonetaria / 100);

        return valorFinal;
    }

    // Métodos getters para acessar os atributos (se necessário)
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

}
