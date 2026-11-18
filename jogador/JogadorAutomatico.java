package jogador;
import jogo.Marca;
import jogo.Tabuleiro;

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
            this.marca=new Marca('X');
        else
            this.marca=new Marca('O');
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
        return this.marca;
        // retorna a marca do jogador
    }

    public void facaSuaJogada ()
    {
        try
        {
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (!this.tabDoJogo.haMarcaNaPosicao(i,0) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,1) && this.tabDoJogo.getMarcaNaPosicao(i,1).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,2) && this.tabDoJogo.getMarcaNaPosicao(i,2).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,0);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(i,0) && this.tabDoJogo.getMarcaNaPosicao(i,0).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,1) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,2) && this.tabDoJogo.getMarcaNaPosicao(i,2).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,1);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(i,0) && this.tabDoJogo.getMarcaNaPosicao(i,0).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,1) && this.tabDoJogo.getMarcaNaPosicao(i,1).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,2))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,2);
                        return;
                    }
            }
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (!this.tabDoJogo.haMarcaNaPosicao(0,i) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,i) && this.tabDoJogo.getMarcaNaPosicao(1,i).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,i) && this.tabDoJogo.getMarcaNaPosicao(2,i).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,i);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,i) && this.tabDoJogo.getMarcaNaPosicao(0,i).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,i) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,i) && this.tabDoJogo.getMarcaNaPosicao(2,i).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,i);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,i) && this.tabDoJogo.getMarcaNaPosicao(0,i).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,i) && this.tabDoJogo.getMarcaNaPosicao(1,i).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,i))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,i);
                        return;
                    }
            }
            // tentando ganhar na diagonal principal
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
                    return;
                }
            else
            // tentando ganhar na diagonal secundaria
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
                    return;
                }
            else
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (!this.tabDoJogo.haMarcaNaPosicao(i,0) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,1) && !this.tabDoJogo.getMarcaNaPosicao(i,1).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,2) && !this.tabDoJogo.getMarcaNaPosicao(i,2).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,0);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(i,0) && !this.tabDoJogo.getMarcaNaPosicao(i,0).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,1) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,2) && !this.tabDoJogo.getMarcaNaPosicao(i,2).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,1);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(i,0) && !this.tabDoJogo.getMarcaNaPosicao(i,0).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,1) && !this.tabDoJogo.getMarcaNaPosicao(i,1).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,2))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,2);
                        return;
                    }
            }
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (!this.tabDoJogo.haMarcaNaPosicao(0,i) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,i) && !this.tabDoJogo.getMarcaNaPosicao(1,i).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,i) && !this.tabDoJogo.getMarcaNaPosicao(2,i).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,i);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,i) && !this.tabDoJogo.getMarcaNaPosicao(0,i).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,i) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,i) && !this.tabDoJogo.getMarcaNaPosicao(2,i).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,i);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,i) && !this.tabDoJogo.getMarcaNaPosicao(0,i).equals(this.marca) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,i) && !this.tabDoJogo.getMarcaNaPosicao(1,i).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,i))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,i);
                        return;
                    }
            }
            // tentando atrapalhar vitoria na diagonal principal
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && !this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && !this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
                    return;
                }
            else
            // tentando atrapalhar vitoria na diagonal secundaria
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && !this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && !this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && !this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
                    return;
                }
            else
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (!this.tabDoJogo.haMarcaNaPosicao(i,0) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,1) && this.tabDoJogo.getMarcaNaPosicao(i,1).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,2))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,2);
                        return;
                    }
                else
                if (!this.tabDoJogo.haMarcaNaPosicao(i,0) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,1) &&
                    this.tabDoJogo.haMarcaNaPosicao(i,2) && this.tabDoJogo.getMarcaNaPosicao(i,2).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,0);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(i,0) && this.tabDoJogo.getMarcaNaPosicao(i,0).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,1) &&
                    !this.tabDoJogo.haMarcaNaPosicao(i,2))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,1);
                        return;
                    }
            }
            for ( byte i = (byte) 0 ; i<3 ; i++ ) {
                if (!this.tabDoJogo.haMarcaNaPosicao(0,i) &&
                    this.tabDoJogo.haMarcaNaPosicao(1,i) && this.tabDoJogo.getMarcaNaPosicao(1,i).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,i))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,i);
                        return;
                    }
                else
                if (!this.tabDoJogo.haMarcaNaPosicao(0,i) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,i) &&
                    this.tabDoJogo.haMarcaNaPosicao(2,i) && this.tabDoJogo.getMarcaNaPosicao(2,i).equals(this.marca))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,i);
                        return;
                    }
                else
                if (this.tabDoJogo.haMarcaNaPosicao(0,i) && this.tabDoJogo.getMarcaNaPosicao(0,i).equals(this.marca) &&
                    !this.tabDoJogo.haMarcaNaPosicao(1,i) &&
                    !this.tabDoJogo.haMarcaNaPosicao(2,i))
                    {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,i);
                        return;
                    }
            }
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,0);
                    return;
                }
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,0) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,2) && this.tabDoJogo.getMarcaNaPosicao(2,2).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,0) && this.tabDoJogo.getMarcaNaPosicao(0,0).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,2))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,2);
                    return;
                }
            else
            // tentando ganhar na diagonal secundaria
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                this.tabDoJogo.haMarcaNaPosicao(1,1) && this.tabDoJogo.getMarcaNaPosicao(1,1).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 0,2);
                    return;
                }
            else
            if (!this.tabDoJogo.haMarcaNaPosicao(0,2) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                this.tabDoJogo.haMarcaNaPosicao(2,0) && this.tabDoJogo.getMarcaNaPosicao(2,0).equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                    return;
                }
            else
            if (this.tabDoJogo.haMarcaNaPosicao(0,2) && this.tabDoJogo.getMarcaNaPosicao(0,2).equals(this.marca) &&
                !this.tabDoJogo.haMarcaNaPosicao(1,1) &&
                !this.tabDoJogo.haMarcaNaPosicao(2,0))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 2,0);
                    return;
                }
            else
            if(!this.tabDoJogo.haMarcaNaPosicao(1,1)){
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, 1,1);
                    return;
            }
            for(byte i=0; i<3; i++){
                for(byte p=0; p<3; p++){
                    if(!this.tabDoJogo.haMarcaNaPosicao(i,p)) {
                        this.tabDoJogo.setMarcaNaPosicao(this.marca, i,p);
                        return;
                    };
                }
            }
        }
        catch (Exception erro)
        {} // ignorando pois sei que n o estou usando posicao invalida nem comparando com equals um null
    }
}