/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t1090354
 */
public abstract class Itens_Mercados {

    protected String categoria;
    protected String alimentos;
    protected String ItensLimpeza;
    protected double precos;
    protected String outros;

    public abstract void imprimirAlimentos();

    public abstract void imprimirLimpeza();

    public abstract void imprimirUtilidades();

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }

    public String getItensLimpeza() {
        return ItensLimpeza;
    }

    public void setItensLimpeza(String ItensLimpeza) {
        this.ItensLimpeza = ItensLimpeza;
    }

    public double getPrecos() {
        return precos;
    }

    public void setPrecos(double precos) {
        this.precos = precos;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

}
