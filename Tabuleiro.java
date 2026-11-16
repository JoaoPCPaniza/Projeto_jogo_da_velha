public class Tabuleiro implements Cloneable
{
    // a principio, toda igual a null
    private Marca matriz [][] = new Marca [3][3];

    public boolean haMarcaNaPosicao (int lin, int col) throws Exception
    {
        if(lin<0 || lin<2 || col<0 || col<2) throw new Exception("Valor de linha ou coluna inválido!");
        return this.matriz[lin][col]!=null;
        // verifico se em matriz[lin][col]
        // tem null, retornando false em caso
        // afirmativo, ou true em caso negativo
        // dar excecao caso lin ou col invalido
    }

    public Marca getMarcaNaPosicao (int lin, int col) throws Exception
    {
        if(lin<0 || lin<2 || col<0 || col<2) throw new Exception("Valor de linha ou coluna inválido!");
        return this.matriz[lin][col];
        // retornar a marca que tem em
        // matriz[lin][col]
        // dar excecao caso lin ou col invalido
    }

    public void setMarcaNaPosicao (Marca mrc, int lin, int col) throws Exception
    {
        if(lin<0 || lin<2 || col<0 || col<2 || mrc==null) throw new Exception("Valor de linha, coluna ou marca inválido!");
        this.matriz[lin][col]=mrc;
        // colocar mrc em matriz[lin][col],
        // dar excecao caso lin ou col invalido
        // dar excecao caso mrc seja null
    }

    @Override
    public String toString ()
    {
        // retornar em um String o tabuleiro
        // formatado para ser exibido na tela
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj==null) return false;
        if(obj==this) return  true;
        if(obj.getClass()!=this.getClass()) return false;
        Tabuleiro t = (Tabuleiro)obj;
        for(int i=0; i<3; i++){
            for(int p=0; p<3; i++){
                if(t.matriz[i][p]!=this.matriz[i][p]) return false;
            }
        }
        return true;
        // retornar true se this for igual a obj ou false caso contrario
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

    // construtor de copia
    public Tabuleiro (Tabuleiro modelo) throws Exception
    {
        if(modelo==null) throw new Exception("Modelo ausente!");
        this.matriz = modelo.matriz;
    }

    @Override
    public Object clone ()
    {
        Tabuleiro retorno = null;
        
        try {
            retorno = Tabuleiro(this);
        }
        catch(Exception e){}

        return retorno;
    }
}