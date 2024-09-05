package br.com.guilhermevillaca.poo.exemplo_enum;

/**
 *
 * @author 10380
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Dia hoje = Dia.QUARTA;
        
        //System.out.println(hoje);        
        //System.out.println("valor do dia " + hoje.getValor());
        
        //Criar o time
        Time time = new Time();
        
        //Criar 11 jogadores
        Jogador jogador1 = new Jogador("Joao", 1, PosicaoTatica.GOLEIRO);
        Jogador jogador2 = new Jogador("Carlos", 2, PosicaoTatica.LATERAL);
        Jogador jogador3 = new Jogador("Pedro", 3, PosicaoTatica.ZAGUEIRO);
        Jogador jogador4 = new Jogador("Rafael", 4, PosicaoTatica.ZAGUEIRO);
        Jogador jogador5 = new Jogador("Lucas", 5, PosicaoTatica.VOLANTE);
        Jogador jogador6 = new Jogador("Ricardo", 6, PosicaoTatica.LATERAL);
        Jogador jogador7 = new Jogador("Marcos", 7, PosicaoTatica.MEIA);
        Jogador jogador8 = new Jogador("Joaquim", 8, PosicaoTatica.MEIA);
        Jogador jogador9 = new Jogador("Dudu", 9, PosicaoTatica.ATACANTE);
        Jogador jogador10 = new Jogador("Gabriel", 10, PosicaoTatica.ATACANTE);
        Jogador jogador11 = new Jogador("Luis", 11, PosicaoTatica.ATACANTE);
        
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);
        time.adicionarJogador(jogador4);
        time.adicionarJogador(jogador5);
        time.adicionarJogador(jogador6);
        time.adicionarJogador(jogador7);
        time.adicionarJogador(jogador8);
        time.adicionarJogador(jogador9);
        time.adicionarJogador(jogador10);
        time.adicionarJogador(jogador11);
        
        System.out.println("Jogadores do time");
        time.consultarJogadores();
        
        //Substituir jogador
        Jogador novoJogador = new Jogador("Roberto", 18, PosicaoTatica.ATACANTE);
        time.substituirJogador(10, novoJogador);
        
        System.out.println("Jogadores do time depois da substituicao");
        time.consultarJogadores();
        
        
    }

}
