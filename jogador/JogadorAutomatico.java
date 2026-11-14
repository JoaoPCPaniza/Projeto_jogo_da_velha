package jogador;

public class JogadorAutomatico implements Jogador
{
    private Marca     marca     = null;
    private Tabuleiro tabDoJogo = null;

    public JogadorAutomatico (Tabuleiro tab) throws Exception
    {   
        if(tab==null) throw new Exception("Tabuleiro ausente!");
        this.tabDoJogo = tab;
        // atribuir tab para tabDoJogo
        // fazer o jogador escolher sua marca
        // via sorteio de numeros aleatorio
        if ((int)(Math.random()*2) == 0)
            this.marca=new marca('X');
        else
            this.marca=new marca('O');
    }

    public JogadorAutomatico (Tabuleiro tab, Marca mrc) throws Exception
    {
        if(tab==null || mrc==null) throw new Exception("Tabuleiro ou Marca ausentes!");
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
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal secundaria
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (this.tabDoJogo.matriz[i][0]==null &&
                    this.tabDoJogo.matriz[i][1]!=null && !this.tabDoJogo.matriz[i][1].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][2]!=null && !this.tabDoJogo.matriz[i][2].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,0);
                    return;
                else
                if (this.tabDoJogo.matriz[i][0]!=null && !this.tabDoJogo.matriz[i][0].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][1]==null &&
                    this.tabDoJogo.matriz[i][2]!=null && !this.tabDoJogo.matriz[i][2].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,1);
                    return;
                else
                if (this.tabDoJogo.matriz[i][0]!=null && !this.tabDoJogo.matriz[i][0].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][1]!=null && !this.tabDoJogo.matriz[i][1].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][2]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,2);
                    return;
            }
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (this.tabDoJogo.matriz[0][i]==null &&
                    this.tabDoJogo.matriz[1][i]!=null && !this.tabDoJogo.matriz[1][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[2][i]!=null && !this.tabDoJogo.matriz[2][i].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,i);
                    return;
                else
                if (this.tabDoJogo.matriz[0][i]!=null && !this.tabDoJogo.matriz[0][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[1][i]==null &&
                    this.tabDoJogo.matriz[2][i]!=null && !this.tabDoJogo.matriz[2][i].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,i);
                    return;
                else
                if (this.tabDoJogo.matriz[0][i]!=null && !this.tabDoJogo.matriz[0][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[1][i]!=null && !this.tabDoJogo.matriz[1][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[2][i]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,i);
                    return;
            }
            else
            // tentando atrapalhar vitoria na diagonal principal
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && !this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && !this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando atrapalhar vitoria na diagonal secundaria
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][0]!=null && !this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && !this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]!=null && !this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (this.tabDoJogo.matriz[i][0]==null &&
                    this.tabDoJogo.matriz[i][1]!=null && this.tabDoJogo.matriz[i][1].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][2]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,0);
                    return;
                else
                if (this.tabDoJogo.matriz[i][0]!=null &&
                    this.tabDoJogo.matriz[i][1]==null &&
                    this.tabDoJogo.matriz[i][2]==null && this.tabDoJogo.matriz[i][0].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,1);
                    return;
                else
                if (this.tabDoJogo.matriz[i][0]!=null && this.tabDoJogo.matriz[i][0].equals(this.marca) &&
                    this.tabDoJogo.matriz[i][1]==null &&
                    this.tabDoJogo.matriz[i][2]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,2);
                    return;
            }
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (this.tabDoJogo.matriz[0][i]==null &&
                    this.tabDoJogo.matriz[1][i]!=null && this.tabDoJogo.matriz[1][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[2][i]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,i);
                    return;
                else
                if (this.tabDoJogo.matriz[0][i]==null &&
                    this.tabDoJogo.matriz[1][i]==null &&
                    this.tabDoJogo.matriz[2][i]!=null && this.tabDoJogo.matriz[2][i].equals(this.marca))
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,i);
                    return;
                else
                if (this.tabDoJogo.matriz[0][i]!=null && this.tabDoJogo.matriz[0][i].equals(this.marca) &&
                    this.tabDoJogo.matriz[1][i]==null &&
                    this.tabDoJogo.matriz[2][i]==null)
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,i);
                    return;
            }
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
            else
            if (this.tabDoJogo.matriz[0][0]==null &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]!=null && this.tabDoJogo.matriz[2][2].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][0]!=null && this.tabDoJogo.matriz[0][0].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][2]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
            else
            // tentando ganhar na diagonal secundaria
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][1]!=null && this.tabDoJogo.matriz[1][1].equals(this.marca) &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
            else
            if (this.tabDoJogo.matriz[0][2]==null &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][0]!=null && this.tabDoJogo.matriz[2][0].equals(this.marca))
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
            else
            if (this.tabDoJogo.matriz[0][2]!=null && this.tabDoJogo.matriz[0][2].equals(this.marca) &&
                this.tabDoJogo.matriz[1][1]==null &&
                this.tabDoJogo.matriz[2][0]==null)
                this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
            else
            for(byte i=0; i<3; i++){
                for(byte p=0; p<0; p++){
                    if(this.tabDoJogo.matriz[i][p]==null) this.tabDoJogo.setMarcaNaPosicao(this.marca, i,p);
                }
            }
        }
        catch (Exception erro)
        {} // ignorando pois sei que n o estou usando posicao invalida nem comparando com equals um null
    }
}