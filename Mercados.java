
/**
 *
 * @author Gabriel Ferreira - Rafael Sampaio
 */
public abstract class Mercados {

    protected String nomemercado;
    protected int IDMercado;
    protected String funcionarios;
    protected String endereco;

    public void setnomeMercado(String nome) {
        this.nomemercado = nome;

    }

    public String getnomeMercado() {
        return this.nomemercado;
    }

    public void SetEndereco(String Endereco) {
        this.endereco = Endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void SetIdMercado(int X) {
        this.IDMercado = X;
    }

    public int getIdMercado() {
        return IDMercado;
    }

}
