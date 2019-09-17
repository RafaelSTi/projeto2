
import javax.swing.JOptionPane;

public class Localidade {

    private String asaNorte;
    private String lagoNorte;
    private String aguasClaras;
    private String asaSul;
    private String guara;

    public Localidade() {
    }

    public Localidade(String asaNorte, String lagoNorte, String aguasClaras, String asaSul, String guara) {
        this.asaNorte = asaNorte;
        this.lagoNorte = lagoNorte;
        this.aguasClaras = aguasClaras;
        this.asaSul = asaSul;
        this.guara = guara;
    }

    public void setAsaNorte(String nome) {
        asaNorte = nome;
    }

    public String getAsaNorte() {
        return asaNorte;
    }

    public void setLagoNorte(String nome) {
        lagoNorte = nome;
    }

    public String getLagoNorte() {
        return lagoNorte;
    }

    public void setAguasClaras(String nome) {
        aguasClaras = nome;
    }

    public String getAguasClaras() {
        return aguasClaras;
    }

    public void setAsaSuL(String nome) {
        asaSul = nome;
    }

    public String getAsaSul() {
        return asaSul;
    }

    public void setGuara(String nome) {
        guara = nome;
    }

    public String getGuara() {
        return guara;
    }

    public void mercadosAsaNorte() {

        System.out.printf("O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado Extra asa norte(3 Km)\n-");
        JOptionPane.showMessageDialog(null, "O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado Extra asa norte(3 Km)\n");

    }

    public void mercadosAsaSul() {
        JOptionPane.showMessageDialog(null, "O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado Dona de casa (4 km)\n");
        System.out.println("O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado Dona de casa (4 km)");
    }

    public void mercadosAguasClaras() {
JOptionPane.showMessageDialog(null, "O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado Carrefour (6 km)");
        System.out.println("O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado Carrefour (6 km)");
    }

    public void mercadosGuara() {
JOptionPane.showMessageDialog(null, "O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado bigbox (2 km)");
        System.out.println("O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado bigbox (2 km)");
    }

    public void mercadosLagoNorte() {
JOptionPane.showMessageDialog(null, "O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado atacadao (5 km)");
        System.out.println("O SUPERMERCADO MAIS PROXIMO É:\n-Supermercado atacadao (5 km)");
    }
}
