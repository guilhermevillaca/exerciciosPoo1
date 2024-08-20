package br.com.guilhermevillaca.poo.julho.atv2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 10380
 */
public class Padaria {

    private List<Bolo> bolos;
    private List<Pao> paes;

    public Padaria() {
        this.bolos = new ArrayList<>();
        this.paes = new ArrayList<>();
    }

    public void adicionarBolo(Bolo bolo) {
        bolos.add(bolo);
    }

    public void adicionarPao(Pao pao) {
        paes.add(pao);
    }

    public List<Bolo> getBolos() {
        return bolos;
    }

    public List<Pao> getPaes() {
        return paes;
    }

    public void relatorioBolos() {
        System.out.println("Bolos disponiveis:");
        for (int i = 0; i < bolos.size(); i++) {
            System.out.println(bolos.get(i).toString());
        }
    }

    public void relatorioPaes() {
        System.out.println("Paes disponiveis:");
        for (int i = 0; i < paes.size(); i++) {
            System.out.println(paes.get(i).toString());
        }
    }

}
