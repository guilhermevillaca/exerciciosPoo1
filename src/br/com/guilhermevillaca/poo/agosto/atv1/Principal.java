package br.com.guilhermevillaca.poo.agosto.atv1;

/**
 *
 * @author 10380
 */
public class Principal {

    public static void main(String[] args) {
        // Criação de um objeto Imovel
        Imovel imovel = new Imovel("João Silva", "Rua das Flores, 123", 200000.0, 2010);

        // Cálculo do valor de venda
        double valorVenda = imovel.calcularValorVenda(2024, 5.0); // ano de venda: 2024, taxa de correção: 5%
        System.out.println("Valor de venda: " + valorVenda);
    }

}
