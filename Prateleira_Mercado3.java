import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Prateleira_Mercado3 extends Itens_Mercados {

    @Override
    public void imprimirAlimentos() {
        ArrayList<String> Alimentos = new ArrayList();
        Alimentos.add("Açúcar Refinado UNIÃO Pacote 1kg R$ 2,99\n");
        Alimentos.add("Sal Refinado CISNE Pacote 1k R$ 1,45\n"
                + "");
        Alimentos.add("Arroz Agulhinha Tipo 1 QUALITÁ Pacote 1kg R$ 2,85\n");
        Alimentos.add("Feijão Branco QUALITÁ 500g SEM ESTOQUE\n"
                + " ");
        Alimentos.add("Farinha de Trigo Tradicional DONA BENTA Pacote 1kg R$ 6,\n");
        Alimentos.add("Café Torrado e Moído Tradicional QUALITÁ Pacote 250g R$ 4,50\n");
        Alimentos.add("Leite Longa Vida Integral QUALITÁ 1 Litro SEM ESTOQUE\n");
        Alimentos.add("Alcatra em Bife Bandeja 500g R$ 19,50\n");
        Alimentos.add("Iogurte Líquido Zero Lactose Desnatado Sabor Morango TAEQ 900g SEM ESTOQUE\n");
        JOptionPane.showMessageDialog(null, Alimentos);

    }

    @Override
    public void imprimirLimpeza() {
        ArrayList<String> Limpeza = new ArrayList();
        Limpeza.add("Sabão Líquido OMO Puro Cuidado 3L R$ 34,90\n");
        Limpeza.add("Lava Louças QUALITÁ Secante Abrilhantador 100ml INDISPONIVEL\n");
        Limpeza.add("Revitalizador Instantâneo para Roupas COMFORT REFRESH 320ml R$ 8,90\n");
        Limpeza.add("Esponja Dupla Face QUALITÁ com 3 Unidades R$ 2,89\n");
        Limpeza.add("Água Sanitária YPÊ 2 Litros R$ 5,65\n");
        Limpeza.add("Inseticida Aerossol RAID à Base de Água 300ml Grátis 150ml  R$ 16,49\n");
        Limpeza.add("Sabão em Pó TIXAN YPÊ Limpeza Perfumada com Maciez Caixa 1kgSEM ESTOQUE\n");
        Limpeza.add("Luva Média Multiuso Plus SPONTEX R$ 12,99\n");
        Limpeza.add("Flanela QUALITÁ 33cm x 33cm   SEM ESTOQUE\n");
        JOptionPane.showMessageDialog(null, Limpeza);

    }

    @Override
    public void imprimirUtilidades() {
        ArrayList<String> Utilidades = new ArrayList();
        Utilidades.add("Rolo de Papel Alumínio QUALITÁ 30cm x 7,5m R$ 4,99\n");
        Utilidades.add("Filme de Pvc WYDA 28cm x 15cmSEM ESTOQUE\n");
        Utilidades.add("Toalha de Papel Branca QUALITÁ Pacote com 2 Unidades R$ 22,39\n");
        Utilidades.add("Guardanapo de Papel Folha Simples QUALITÁ 23,5 x 22cm com 50 Unidades R$ 2,99\n");
        Utilidades.add("Fósforo Extra Longos FIAT LUX com 50 Unidades SEM ESTOQUE\n");
        Utilidades.add("Vela Branca QUALITÁ 25g Pacote com 8 Unidades SEM ESTOQUE\n");
        JOptionPane.showMessageDialog(null, Utilidades);

    }

}
