
/**
 *
 * @author Gabriel Ferreira - Rafael Sampaio
 */
public abstract class Funcionario {

    protected String nome;
    protected int id;
    protected String tipo;

    public void setNome(String x) {
        this.nome = x;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
