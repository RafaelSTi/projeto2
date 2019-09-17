
/**
 *
 * @author Gabriel Ferreira - Rafael Sampaio
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public  class Produtos {

    ArrayList<String> Itens = new ArrayList();
    private String nomeprod;
    private double preço;
    private String descricao;
    private String validade;
    private double peso;

    public String getNomeprod() {
        return nomeprod;
    }

    public void setNomeprod(String nomeprod) {
        this.nomeprod = nomeprod;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void ImprimirTipoItens(){  
        
        ArrayList<String> categorias = new ArrayList();
                categorias.add("\n1)Alimentos\n2)Limpeza\n3)Utilizades");
                int categories = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual categoria de itens?" + categorias));
             
   }
    
    
    
}
