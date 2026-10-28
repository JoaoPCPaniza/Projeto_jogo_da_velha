package jogador;

public class JogadorAutomatico implements Jogador
{
    private Marca     marca     = null;
    private Tabuleiro tabDoJogo = null;

    public JogadorAutomatico (Tabuleiro tab) throws Exception
    {   tabDoJogo = tab;
        // atribuir tab para tabDoJogo
        // fazer o jogador escolher sua marca
        // via sorteio de numeros aleatorio
        if ((int)(Math.random()*2) == 0)
            marca=new marca('X');
        else
            marca=new marca('O');
    }

    public JogadorAutomatico (Tabuleiro tab, Marca mrc) throws Exception
    {
        this.tabDoJogo = tab;
        this.marca = mrc;
        // atribuir tab para tabDoJogo
        // e mrc para marca
    }

    public Marca getMarca ()
    {
        return this.Marca;
        // retorna a marca do jogador
    }

    public void facaSuaJogada ()
    {
        try
        {
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (this.tabDoJogo.matriz[i][0]==null &&
                    this.tabDoJogo.matriz[i][1]!=null && this.tabDoJogo.matriz[i][1].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][2]!=null && this.tabDoJogo.matriz[i][2].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,0);
                    return;
                else
                if (this.tabDoJogo.matriz[i][0]!=null && this.tabDoJogo.matriz[i][0].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][1]==null &&
                    this.tabDoJogo.matriz[i][2]!=null && this.tabDoJogo.matriz[i][2].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,1);
                    return;
                else
                if (this.tabDoJogo.matriz[i][0]!=null && this.tabDoJogo.matriz[i][0].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][1]!=null && this.tabDoJogo.matriz[i][1].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][2]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,2);
                    return;
            }
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (this.tabDoJogo.matriz[0][i]==null &&
                    this.tabDoJogo.matriz[1][i]!=null && this.tabDoJogo.matriz[1][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[2][i]!=null && this.tabDoJogo.matriz[2][i].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,i);
                    return;
                else
                if (this.tabDoJogo.matriz[0][i]!=null && this.tabDoJogo.matriz[0][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[1][i]==null &&
                    this.tabDoJogo.matriz[2][i]!=null && this.tabDoJogo.matriz[2][i].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,i);
                    return;
                else
                if (this.tabDoJogo.matriz[0][i]!=null && this.tabDoJogo.matriz[0][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[1][i]!=null && this.tabDoJogo.matriz[1][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[2][i]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,i);
                    return;
            }
            // tentando ganhar na diagonal principal
            if ... else if ... else if ...
            else
            // tentando ganhar na diagonal secundaria
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na linha 0
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na linha 1
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na linha 2
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na coluna 0
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na coluna 1
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na coluna 2
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na diagonal principal
            if ... else if ... else if ...
            else
            // tentando atrapalhar vitoria na diagonal secundaria
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 0
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 1
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na linha 2
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 0
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 1
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na coluna 2
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal principal
            if ... else if ... else if ...
            else
            // tentando jogada de futuro (há 1 marca do jogador e mais nada; vamos lá e plantamos outra marca) na diagonal secundaria
            if ... else if ... else if ...
            else
            // termine jogando num lugar qualquer que esteja livre
        }
        catch (Exception erro)
        {} // ignorando pois sei que n o estou usando posicao invalida nem comparando com equals um null
    }
}