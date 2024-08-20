package br.com.guilhermevillaca.poo.julho.atv1;

import java.util.List;

/**
 *
 * @author 10380
 */
public class Carro {
    
    private Modelo modelo;
    private String cor;
    private String tipo;
    private int numeroDePortas;
    private String motor;
    private List<String> opcionais;

    public Carro(Modelo modelo, String cor, String tipo, int numeroDePortas, String motor, List<String> opcionais) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.numeroDePortas = numeroDePortas;
        this.motor = motor;
        this.opcionais = opcionais;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public List<String> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<String> opcionais) {
        this.opcionais = opcionais;
    }

    public void imprimirRelatorio() {
        System.out.println("Modelo: " + modelo.getNome());
        System.out.println("Marca: " + modelo.getMarca().getNome());
        System.out.println("Cor: " + cor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de Portas: " + numeroDePortas);
        System.out.println("Motor: " + motor);
        System.out.println("Opcionais:");
        for (int i = 0; i < opcionais.size(); i++) {
            System.out.println(opcionais.get(i));
        }        
    }

}
