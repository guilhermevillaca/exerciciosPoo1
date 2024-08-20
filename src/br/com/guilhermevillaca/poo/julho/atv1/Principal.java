package br.com.guilhermevillaca.poo.julho.atv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 10380
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Marca marca1 = new Marca("Toyota");
        Modelo modelo1 = new Modelo("Corolla", marca1);
        Carro carro1 = new Carro(modelo1, "Preto", "Sedan", 4, "1.0 Turbo", Arrays.asList("Ar Condicionado", "Direção Elétrica"));
        carro1.imprimirRelatorio();
    }
    
}
