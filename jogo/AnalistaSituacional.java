package jogo;

public class AnalistaSituacional
{
    private Tabuleiro tabDoJogo;

    public AnalistaSituacional (Tabuleiro tab) throws Exception
    {
        if(tab==null) throw new Exception("Tabuleiro ausente!");
        this.tabDoJogo=tab;
    }

    public Marca getMarcaDoVencedor ()
    {
        for ( byte i = (byte) 0 ; i<3 ; i++ ) {
            try{
                if (this.tabDoJogo.haMarcaNaPosicao(i, 0) &&
                    this.tabDoJogo.haMarcaNaPosicao(i, 1) && this.tabDoJogo.getMarcaNaPosicao(i, 1).equals(this.tabDoJogo.getMarcaNaPosicao(i, 0)) &&
                    this.tabDoJogo.haMarcaNaPosicao(i, 2) && this.tabDoJogo.getMarcaNaPosicao(i, 2).equals(this.tabDoJogo.getMarcaNaPosicao(i, 0)))
                    {
                        return this.tabDoJogo.getMarcaNaPosicao(i, 0);
                    }
            }
            catch(Exception e){}
        }

        for ( byte i = (byte) 0 ; i<3 ; i++ ) {
            try{
                if (this.tabDoJogo.haMarcaNaPosicao(0, i) &&
                    this.tabDoJogo.haMarcaNaPosicao(1, i) && this.tabDoJogo.getMarcaNaPosicao(1, i).equals(this.tabDoJogo.getMarcaNaPosicao(0, i)) &&
                    this.tabDoJogo.haMarcaNaPosicao(2, i) && this.tabDoJogo.getMarcaNaPosicao(2, i).equals(this.tabDoJogo.getMarcaNaPosicao(0, i)))
                    {
                        return this.tabDoJogo.getMarcaNaPosicao(0, i);
                    }
            }
            catch(Exception e){}
        }

        try{
            if (this.tabDoJogo.haMarcaNaPosicao(0, 0) &&
                this.tabDoJogo.haMarcaNaPosicao(1, 1) && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.tabDoJogo.getMarcaNaPosicao(0, 0)) &&
                this.tabDoJogo.haMarcaNaPosicao(2, 2) && this.tabDoJogo.getMarcaNaPosicao(2, 2).equals(this.tabDoJogo.getMarcaNaPosicao(0, 0)))
                {
                    return this.tabDoJogo.getMarcaNaPosicao(0, 0);
                }
        }
        catch(Exception e){}

        try{
            if (this.tabDoJogo.haMarcaNaPosicao(0, 2) &&
                this.tabDoJogo.haMarcaNaPosicao(1, 1) && this.tabDoJogo.getMarcaNaPosicao(1, 1).equals(this.tabDoJogo.getMarcaNaPosicao(0, 2)) &&
                this.tabDoJogo.haMarcaNaPosicao(2, 0) && this.tabDoJogo.getMarcaNaPosicao(2, 0).equals(this.tabDoJogo.getMarcaNaPosicao(0, 2)))
                {
                    return this.tabDoJogo.getMarcaNaPosicao(0, 2);
                }
        }
        catch(Exception e){}

        return null;
        // descobrir se ha um vencedor e retornar
        // a marca dele; retornara null, quando
        // nao houver vencedor
    }

    private boolean tabuleiroCheio ()
    {
        for(byte i=0; i<3; i++){
            for(byte p=0; p<3; p++){
                try{
                    if(!this.tabDoJogo.haMarcaNaPosicao(i,p)) return false;
                }
                catch(Exception e){}
            }
        }
        return true;
        // verificar se todas as posicoes do
        // tabuleiro estao preenchidas (!=null)
        // retornando true em caso afirmativo,
        // ou false em caso negativo
    }

    public boolean fimDeJogo ()
    {
        if(getMarcaDoVencedor()!=null) return true;
        if(tabuleiroCheio()) return true;
        return false;
        // se getMarcaDoVencedor != null,
        // retorna true
        // se tabuleiroCheio == true,
        // retorna true
        // caso contrario, retorna false
    }

    @Override
    public String toString ()
    {
        // faça
        String ret = "";
        if (!this.fimDeJogo()) {
            ret = "Situação: Jogo em andamento";
        }
        else {
            ret =   "Situação: Jogo finalizado" +
                    "\nMarca do vencedor: " + this.getMarcaDoVencedor();
        }
        return ret;
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj==null) return false;
        if(obj==this) return  true;
        if(obj.getClass()!=this.getClass()) return false;
        AnalistaSituacional a = (AnalistaSituacional)obj;
        return a.tabDoJogo==this.tabDoJogo;
    }

    @Override
    public int hashCode ()
    {
        int retorno = 7;
        for(int i=0; i<3; i++){
            for(int p=0; p<3; p++){
                try{
                    retorno = retorno * 31 + this.tabDoJogo.getMarcaNaPosicao(i, p).hashCode();
                }
                catch(Exception e){}
            }
        }
        if(retorno<0) retorno = -retorno;
        return retorno;
    }
}