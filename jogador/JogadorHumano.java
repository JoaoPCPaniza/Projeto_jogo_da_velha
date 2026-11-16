package jogador;
import jogo.Marca;
import jogo.Tabuleiro;

import java.io.*;

public class JogadorHumano implements Jogador
{
    private int            jogadas   = 0;
    private Marca          marca     = null;
    private Tabuleiro      tabDoJogo = null;
    private BufferedReader teclado   = new BufferedReader
                                        (new InputStreamReader
                                        (System.in));

    public JogadorHumano (Tabuleiro tab) throws Exception
    {
        if(tab==null) throw new Exception("Tabuleiro ausente!");
        this.tabDoJogo = tab;
        System.out.println("Digite qual marca você deseja? (X/O)");
        char letra = 'c';
        String entrada;
        try{
            entrada = teclado.readLine();
            if(entrada != null && !entrada.isEmpty()) {
                letra = entrada.toUpperCase().charAt(0);
            }
            else System.out.println("Nenhuma letra digitada.");
        }
        catch(Exception e) {
            System.out.println("Erro na leitura"+e.getMessage());
        }
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
        if(this.jogadas==0) System.out.println("Digite primeiro a linha, de 0 a 2, e depois a coluna, de 0 a 2");

        int linha;
        int coluna;

        for(;;){
            System.out.println("Em qual linha deseja jogar ?");
            try {
                String entLinha = teclado.readLine();
                if(entLinha!=null && !entLinha.isEmpty()) {
                    linha = Integer.parseInt(entLinha.trim());
                    if(linha>2 || linha<0){
                        System.out.println("Valor digitado inválido, tente novamente!");
                    }
                    else break;
                }
                else {
                    System.out.println("Nenhum valor digitado, tente novamente!");
                }
            }
            catch(Exception e){
                System.out.println("Erro na leitura, tente novamente!");
            }
        }

        for(;;){
            System.out.println("Em qual coluna deseja jogar ?");
            try {
                String entColuna = teclado.readLine();
                if(entColuna!=null && !entColuna.isEmpty()) {
                    coluna = Integer.parseInt(entColuna.trim());
                    if(coluna>2 || coluna<0){
                        System.out.println("Valor digitado inválido, tente novamente!");
                    }
                    else break;
                }
                else {
                    System.out.println("Nenhum valor digitado, tente novamente!");
                }
            }
            catch(Exception e){
                System.out.println("Erro na leitura, tente novamente!"); 
            }
        }

        try{
            this.tabDoJogo.setMarcaNaPosicao(this.marca, linha,coluna);
        }
        catch(Exception e){}
        
        this.jogadas++;
    }

    public void vcGanhou ()
    {
        System.out.println("PARABÉNS MALIGNOZINHO, você venceu!");
    }

    public void vcPerdeu ()
    {
        System.out.println("VOCÊ ESTÁ DECADENTE, você perdeu!");
    }

    public void deuVelha ()
    {
        System.out.println("VOCÊ JÁ FOI MELHOR EM, deu velha!");
    }

    public boolean querMaisUmaPartida ()
    {   
        System.out.println("Deseja jogar novamente ? (S/N)");
        for(;;) {    
            try {
                String entrada = teclado.readLine().toUpperCase().trim();
                
                    if(!entrada.equals("S") && !entrada.equals("N")){
                        System.out.println("Valor digitado inválido, tente novamente!");
                    }
                    else
                    if(entrada.equals("S")) return true;
                    if(entrada.equals("N")) break;
            }
            catch(Exception e){
                System.out.println("Erro na leitura!");
            }
        }
        return false;
        // perguntar se deseja jogar de novo
        // permitindo digitacao e retornando
        // true ou false, conforme a resposta
    }
}