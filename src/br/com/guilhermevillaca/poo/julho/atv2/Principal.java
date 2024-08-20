package br.com.guilhermevillaca.poo.julho.atv2;

/**
 *
 * @author 10380
 */
public class Principal {

    public static void main(String[] args) {
        Padaria minhaPadaria = new Padaria();

        Bolo bolo1 = new Bolo("Chocolate", "Grande", 79.99);
        Bolo bolo2 = new Bolo("Cenoura", "Pequeno", 49.99);
        Bolo bolo3 = new Bolo("Baunilha", "Medio", 69.99);

        Pao pao1 = new Pao("Frances", 0.5, 1.99);
        
        minhaPadaria.adicionarBolo(bolo1);
        minhaPadaria.adicionarBolo(bolo2);
        minhaPadaria.adicionarBolo(bolo3);
        minhaPadaria.adicionarPao(pao1);
        
        minhaPadaria.relatorioBolos();
        minhaPadaria.relatorioPaes();
        
    }

}
