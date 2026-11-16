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
            if (this.tabDoJogo.matriz[i][0]==null &&
                this.tabDoJogo.matriz[i][1]!=null && this.tabDoJogo.matriz[i][1].equals(this.marca) &&
                this.tabDoJogo.matriz[i][2]!=null && this.tabDoJogo.matriz[i][2].equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,0);
                    return;
                }
            else
            if (this.tabDoJogo.matriz[i][0]!=null && this.tabDoJogo.matriz[i][0].equals(this.marca) &&
                this.tabDoJogo.matriz[i][1]==null &&
                this.tabDoJogo.matriz[i][2]!=null && this.tabDoJogo.matriz[i][2].equals(this.marca))
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,1);
                    return;
                }
            else
            if (this.tabDoJogo.matriz[i][0]!=null && this.tabDoJogo.matriz[i][0].equals(this.marca) &&
                this.tabDoJogo.matriz[i][1]!=null && this.tabDoJogo.matriz[i][1].equals(this.marca) &&
                this.tabDoJogo.matriz[i][2]==null)
                {
                    this.tabDoJogo.setMarcaNaPosicao(this.marca, i,2);
                    return;
                }
        }
        // descobrir se ha um vencedor e retornar
        // a marca dele; retornara null, quando
        // nao houver vencedor
    }

    private boolean tabuleiroCheio ()
    {
        // verificar se todas as posicoes do
        // tabuleiro estao preenchidas (!=null)
        // retornando true em caso afirmativo,
        // ou false em caso negativo
    }

    public boolean fimDeJogo ()
    {
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
                retorno = retorno * 31 + this.matriz[i][p].hashCode();
            }
        }
        if(retorno<0) retorno = -retorno;
        return retorno;
    }
}