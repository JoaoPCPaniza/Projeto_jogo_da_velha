import jogador.*;
import jogo.AnalistaSituacional;
import jogo.Marca;
import jogo.Tabuleiro;

public class Velha
{
    public static void main (String args [])
    {
        Tabuleiro           tabDoJogo;

        Jogador             jogadorDaVez = null;
        JogadorHumano       jogadorH     = null;
        JogadorAutomatico   jogadorA     = null;

        AnalistaSituacional analista;

        boolean jogadorHumanoComeca = (int)(Math.random()*2) == 0;

        do
        {
            try
            {
                tabDoJogo = new Tabuleiro ();

                if (jogadorHumanoComeca)
                {
                    jogadorH = new JogadorHumano (tabDoJogo);
                    jogadorA = new JogadorAutomatico
                              (tabDoJogo,
                               new Marca(jogadorH.getMarca().getSimbolo()=='X'?'O':'X'));

                    jogadorDaVez=jogadorH;
                }
                else
                {
                    jogadorA = new JogadorAutomatico (tabDoJogo);
                    jogadorH = new JogadorHumano
                              (tabDoJogo,
                               new Marca(jogadorA.getMarca().getSimbolo()=='X'?'O':'X'));

                    jogadorDaVez=jogadorA;
                }

                analista = new AnalistaSituacional (tabDoJogo);
                System.out.println(tabDoJogo);

                do
                {
                    jogadorDaVez.facaSuaJogada();

                    if (jogadorDaVez==jogadorH){
                        jogadorDaVez=jogadorA;
                        System.out.println("\n Jogada do player:");
                    }
                    else{
                        jogadorDaVez=jogadorH;
                        System.out.println("Jogada da maquina:");
                    }

                    System.out.println(tabDoJogo);
                }
                while (!analista.fimDeJogo());

                if (analista.getMarcaDoVencedor()==null)
                    jogadorH.deuVelha ();

                else
                    if (analista.getMarcaDoVencedor().equals(jogadorH.getMarca()))
                        jogadorH.vcGanhou ();
                    else
                        jogadorH.vcPerdeu ();

                jogadorHumanoComeca = !jogadorHumanoComeca;
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        while (jogadorH.querMaisUmaPartida());
    }
}