import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void main(String arg[]) {
        ArrayList<Cadastro> Cadastrar1 = new ArrayList();
        ArrayList<String> Menu = new ArrayList();
        Produtos c1 = new Produtos();
        Prateleira_Mercado1 c2 = new Prateleira_Mercado1();
        Prateleira_Mercado2 c3 = new Prateleira_Mercado2();
        Prateleira_Mercado3 c4 = new Prateleira_Mercado3();
        Localidade local = new Localidade();
        JOptionPane.showMessageDialog(null, "Realize o cadastro para utilizar o sistema.");

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String SobreNome = JOptionPane.showInputDialog("Digite seu SobreNome");
        String CPF = JOptionPane.showInputDialog("Digite seu CPF");
        String Telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        String Email = JOptionPane.showInputDialog("Digite seu email:");
        JOptionPane.showMessageDialog(null, "Digite sua data de nascimento");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));

        //impedir dados invalidos
        while (dia <= 0) {
            JOptionPane.showMessageDialog(null, "Dado invalido,Digite o dia novamente:");
            dia = Integer.parseInt(JOptionPane.showInputDialog("Dia:"));

        }
        while (mes <= 0) {
            JOptionPane.showMessageDialog(null, "Dado invalido,Digite o mes novamente:");
            mes = Integer.parseInt(JOptionPane.showInputDialog("Dia:"));
        }
        while (ano <= 0) {
            JOptionPane.showMessageDialog(null, "Dado invalido,Digite o ano novamente:");
            ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
        }
        // fim Enquanto

        Cadastro Cadastrar = new Cadastro(nome, SobreNome, CPF, Telefone, Email, ano);
        Cadastrar1.add(Cadastrar);
        // Fim do cadastramento

//MENU
        Object[] opcoes = {"1 - Consultar Dados", "2 - Alterar cadastro", "3 - Excluir cadastro",
            "4 - Buscar itens", "5 - Sair"};

        String Escolha = String.valueOf(JOptionPane.showInputDialog(null, "MENU", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes));

// FIM MENU 
        switch (Escolha) {
            case "1 - Consultar Dados":
                Cadastrar.ImprimirDados();
                break;
            case "2 - Alterar cadastro":
                Object[] change = {"1-Nome", "2-SobreNome", "3-Nascimento",
                    "4-Email", "5-Telefone", "6-CPF"};

                String alteracao = String.valueOf(JOptionPane.showInputDialog(null, "O que deseja alterar?", "Alterar Cadastro", JOptionPane.INFORMATION_MESSAGE, null, change, change));
                switch (alteracao) {
                    case "1-Nome":
                        nome = JOptionPane.showInputDialog("Digite o novo nome:");
                        Cadastrar.setNome(nome);
                        JOptionPane.showMessageDialog(null, "Dado alterado com sucesso");
                        break;
                    case "2-SobreNome":
                        SobreNome = JOptionPane.showInputDialog("Digite o novo SobreNome:");
                        Cadastrar.setSobreNome(SobreNome);
                        JOptionPane.showMessageDialog(null, "Dado alterado com sucesso");
                        break;
                    case "3-Nascimento":
                        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia de seu nascimento:"));
                        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mes de seu nascimento:"));
                        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu  nascimento:"));
                        Cadastrar.setNascimento(ano);
                        JOptionPane.showMessageDialog(null, "Dado alterado com sucesso");
                        break;
                    case "4-Email":
                        Email = JOptionPane.showInputDialog("Digite seu novo email:");
                        Cadastrar.setEmail(Email);
                        JOptionPane.showMessageDialog(null, "Dado alterado com sucesso");
                        break;
                    case "5-Telefone":
                        Telefone = JOptionPane.showInputDialog("Digite seu novo telefone:");
                        Cadastrar.setTelefone(Telefone);
                        JOptionPane.showMessageDialog(null, "Dado alterado com sucesso");
                        break;
                    case "6-CPF":
                        CPF = JOptionPane.showInputDialog("Digite o novo CPF:");
                        Cadastrar.setCPF(CPF);
                        JOptionPane.showMessageDialog(null, "Dado alterado com sucesso");
                        break;

                }
                break;

            case "3 - Excluir cadastro": {
                Cadastrar1.remove(Cadastrar);
                JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");
                break;

            }
            case "4 - Buscar itens": {
                ArrayList<String> locais = new ArrayList();
                locais.add("\n1-ASA NORTE\n2-ASA SUL\n3-AGUAS CLARAS\n4-GUARÁ\n5-LAGO NORTE");
                int naosei = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da sua localização atual:" + locais));

                //inicio validacao
                while ((naosei != 1) && (naosei != 2) && (naosei != 3) && (naosei != 4) && (naosei != 5)) {

                    JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente!", "Erro", JOptionPane.ERROR_MESSAGE);
                    naosei = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da sua localização atual:" + locais));

                } //fim validacao 

                switch (naosei) {
                    case 1:
                        local.mercadosAsaNorte();
                        ArrayList<String> categorias = new ArrayList();
                        categorias.add("\n1)Alimentos\n2)Limpeza\n3)Utilizades");
                        int categoria = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual categoria de itens?(1,2 ou 3)" + categorias));
                        if (categoria == 1) {
                            c2.imprimirAlimentos();

                        }
                        if (categoria == 2) {

                            c2.imprimirLimpeza();
                        }
                        if (categoria == 3) {
                            c2.imprimirUtilidades();
                        }

                        break;
                    case 2:
                        local.mercadosAsaSul();
                        ArrayList<String> categorias2 = new ArrayList();
                        categorias2.add("\n1)Alimentos\n2)Limpeza\n3)Utilizades");
                        int categoria2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual categoria de itens?(1,2 ou 3)" + categorias2));

                        if (categoria2 == 1) {
                            c4.imprimirAlimentos();

                        }
                        if (categoria2 == 2) {
                            c4.imprimirLimpeza();
                        }
                        if (categoria2 == 3) {
                            c4.imprimirUtilidades();
                        }
                        break;
                    case 3:
                        local.mercadosAguasClaras();
                        ArrayList<String> categorias3 = new ArrayList();
                        categorias3.add("\n1)Alimentos\n2)Limpeza\n3)Utilizades");
                        int categoria3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual categoria de itens?(1,2 ou 3)" + categorias3));
                        if (categoria3 == 1) {
                            c3.imprimirAlimentos();

                        }
                        if (categoria3 == 2) {
                            c3.imprimirLimpeza();
                        }
                        if (categoria3 == 3) {
                            c3.imprimirUtilidades();
                        }

                        break;
                    case 4:
                        local.mercadosGuara();
                        ArrayList<String> categorias4 = new ArrayList();
                        categorias4.add("\n1)Alimentos\n2)Limpeza\n3)Utilizades");
                        int categoria4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual categoria de itens?(1,2 ou 3)" + categorias4));
                        if (categoria4 == 1) {
                            c2.imprimirAlimentos();

                        }
                        if (categoria4 == 2) {
                            c2.imprimirLimpeza();
                        }
                        if (categoria4 == 3) {
                            c2.imprimirUtilidades();
                        }

                        break;

                    case 5:
                        local.mercadosLagoNorte();
                        ArrayList<String> categorias5 = new ArrayList();
                        categorias5.add("\n1)Alimentos\n2)Limpeza\n3)Utilizades");
                        int categoria5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual categoria de itens?(1,2 ou 3)" + categorias5));
                        if (categoria5 == 1) {
                            c3.imprimirAlimentos();

                        }
                        if (categoria5 == 2) {
                            c4.imprimirLimpeza();
                        }
                        if (categoria5 == 3) {
                            c2.imprimirUtilidades();
                        }

                        break;
                }

            }
            case "5 - Sair":

                JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");
                break;
        }

    }
}
