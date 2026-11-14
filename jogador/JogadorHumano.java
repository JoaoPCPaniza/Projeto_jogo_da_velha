package jogador;

import java.io.*;

public class JogadorHumano implements Jogador
{
    private Marca          marca     = null;
    private Tabuleiro      tabDoJogo = null;
    private BufferedReader teclado   = new BufferedReader
                                        (new InputStreamReader
                                        (System.in));

    public JogadorHumano (Tabuleiro tab) throws Exception
    {
        if(tab==null) throw new Exception("Tabuleiro ausente!");
        this.tabDoJogo = tab;
        System.out.println("Digite qual marca você deseja? (X ou O)");
        char letra = teclado.readLine().toUpperCase();
        Marca mrc = new Marca(letra);
        this.marca = mrc;
        // atribuir tab para tabDoJogo
        // pedir para o jogador escolher
        // sua marca e permitir digitacao
        // intanciando marca
    }

    public JogadorHumano (Tabuleiro tab, Marca mrc) throws Exception
    {
        if(tab==null || mrc==null) throw new Exception("Tabuleiro ou Marca ausentes!");
        this.tabDoJogo = tab;
        this.marca = mrc;
    }

    public Marca getMarca ()
    {
        return this.marca;
    }

    public void facaSuaJogada ()
    {
        System.out.println("Onde deseja jogar ?");
        System.out.println("Digite primeiro a linha, de 0 a 2, e depois a coluna, tudo por extenso, dessa forma: 'LinhaColuna'");
    }

    public void vcGanhou ()
    {
        System.out.println("PARABÉNS MALIGNOZINHO, você venceu!");
    }

    public void vcPerdeu ()
    {
        System.out.println("VOCÊ ESTÁ DECADENTE, mas não desista, tente novamente!");
    }

    public void deuVelha ()
    {
        System.out.println("VOCÊ JÁ FOI MELHOR EM, deu velha!");
    }

    public boolean querMaisUmaPartida ()
    {
        // perguntar se deseja jogar de novo
        // permitindo digitacao e retornando
        // true ou false, conforme a resposta
    }
}