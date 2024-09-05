package br.com.guilhermevillaca.poo.exemplo_enum;

/**
 *
 * @author 10380
 */
public enum Dia {
    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);

    private int valor;

    Dia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
