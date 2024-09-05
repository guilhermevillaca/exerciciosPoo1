package br.com.guilhermevillaca.poo.exemplo_enum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 10380 Adicionar jogadores - criar regra para ter no máximo 11 Criar
 * pra substituir jogadores Listar jogadores do time
 */
public class Time {

    private List<Jogador> jogadores;

    public Time() {
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogadores.size() < 11) {
            jogadores.add(jogador);
        } else {
            System.out.println("O time já tem 11 jogadores."
                    + "Substitua um jogador para "
                    + "adicionar outro.");
        }
    }

    public void substituirJogador(int numero, Jogador reserva) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNumero() == numero) {
                jogadores.set(i, reserva);
                System.out.println("Jogador substituido");
                return;
            }
        }
        System.out.println("Jogador com numero " + numero
                + " nao encontrado");
    }

    public void consultarJogadores() {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

}
