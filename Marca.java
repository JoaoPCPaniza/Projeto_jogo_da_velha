public class Marca
{
    private char simbolo;

    public Marca (char smb) throws Exception
    {
        if(smb=="X" || smb=="O") this.simbolo=smb;
        else throw new Exception("Valor de símbolo inválido!");
        // validar smb, garantindo que ele
        // seja 'X' ou 'O' e coloca-lo em
        // simbolo
        // dar excecao em caso de valor invalido
    }

    public char getSimbolo ()
    {
        return this.simbolo;
    }

    @Override
    public String toString ()
    {
        return ""+simbolo;
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj==null) return false;
        if(obj==this) return true;
        if(obj.getClass()!=this.getClass()) return false;
        Marca m = (Marca)obj;
        return m.simbolo==this.simbolo;
    }

    @Override
    public int hashCode ()
    {
        int retorno = 7;
        retorno = retorno * 31 + ((Character)this.simbolo).hashCode();

        if(retorno<0) retorno = -retorno;
        return retorno;
    }
}