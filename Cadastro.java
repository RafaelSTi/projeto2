
import javax.swing.JOptionPane;

public class Cadastro {

    private String nome;
    private String SobreNome;
    private String CPF;
    private int Nascimento;
    private String telefone;
    private String email;

    public Cadastro() {
    }
    //Construtor padrao

    public Cadastro(String nome, String SobreNome, String CPF, String telefone, String email, int Nascimento) {
        this.nome = nome;
        this.SobreNome = SobreNome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.Nascimento = Nascimento;
        //construtor com parametros
    }

    //Get
    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getNascimento() {
        return Nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    //set
    public void setNome(String nome1) {
        this.nome = nome1;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSobreNome(String SobreNome) {
        this.SobreNome = SobreNome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNascimento(int nascimento) {
        this.Nascimento = nascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //imprimir dados
    public void ImprimirNome() {

        JOptionPane.showMessageDialog(null, "Nome: " + nome);
    }

    public void ImprimirCPF() {
        JOptionPane.showMessageDialog(null, "CPF:" + CPF);

    }

    public void ImprimirIdade() {
        int idade = 2019 - Nascimento;
        JOptionPane.showMessageDialog(null, "Idade:" + idade + " anos");
    }

    public void ImprimirTelefone() {
        System.out.println("Contato:" + telefone);
        JOptionPane.showMessageDialog(null, "Contato:" + telefone);
    }

    public void ImprimirSobreNome() {
        JOptionPane.showMessageDialog(null, "SobreNome:" + SobreNome);
    }

    public void ImprimirEmail() {
        System.out.println("Email:" + email);
        JOptionPane.showMessageDialog(null, "Email:" + email);
    }

    public void ImprimirDados() {
        int idade = 2019 - Nascimento;
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "SobreNome: " + SobreNome + "\n " + "CPF: " + CPF + "\n"
                + "Idade: " + idade + " anos\n" + "Email: " + email + "\n" + "Contato: " + telefone);

    }
}
