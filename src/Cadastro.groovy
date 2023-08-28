import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Cadastro {


    ArrayList<PessoaPj> listaPj = new ArrayList<PessoaPj>();
    ArrayList<PessoaPf> listaPf = new ArrayList<PessoaPf>();



    public void criarCadastro() {
        System.out.println("Selecione uma ação.");
        System.out.println("1 - Criar Cadastro PJ");
        System.out.println("2 - Criar Cadastro PF");
        System.out.println("3 - Ler");
        System.out.println("4 - finalizar\n");


        Scanner entrada = new Scanner(System.in);
        String opcaoSelecionada = entrada.nextLine();
        System.out.println(opcaoSelecionada);

        if (opcaoSelecionada.equals("1")) {
            criarPessoaPj();
        } else if (opcaoSelecionada.equals("2")) {
            criarPessoaPf();
        } else if (opcaoSelecionada.equals("3")) {
            System.out.println(listaPj);

        } else if (opcaoSelecionada.equals("4")) {
            return;
        }


        criarCadastro();

    }


    public PessoaPf criarPessoaPf(){

        PessoaPf pessoaPf = new PessoaPf();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        var nome = entrada.nextLine();
        pessoaPf.setNome(nome);

        System.out.println("Informe o seu e-mail:");
        var email = entrada.nextLine();
        pessoaPf.setEmail();

        System.out.println("Informe o seu CPF:");
        var CPF = entrada.nextLine();
        pessoaPf.setCPF(CPF);

        System.out.println("Informe seu Estado:");
        var Estado = entrada.nextLine();
        pessoaPf.setEstado(Estado);

        System.out.println("Informe sua data de nascimento:");
        var idade = entrada.nextLine();
        pessoaPf.setIdade(Integer.parseInt(idade));

        System.out.println("Informe seu CEP:");
        var CEP = entrada.nextLine();
        pessoaPf.setCEP(CEP);

        System.out.println("Descrição Pessoal:");
        var DescricaoPessoal = entrada.nextLine();
        pessoaPf.setDescricaoPessoal(DescricaoPessoal);
        listaPf.add(pessoaPf);
        return pessoaPf;
    }
    public PessoaPj criarPessoaPj() {

        PessoaPj pessoaPj = new PessoaPj();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        var nome = entrada.nextLine();
        pessoaPj.setNome(nome);

        System.out.println("Informe o seu e-mail corporativo:");
        var emailCorporativo = entrada.nextLine();
        pessoaPj.setemailCorporativo(emailCorporativo);

        System.out.println("Informe o seu CNPJ:");
        var CNPJ = entrada.nextLine();
        pessoaPj.setCNPJ(CNPJ);

        System.out.println("Informe seu País:");
        var pais = entrada.nextLine();
        pessoaPj.setPais(pais);

        System.out.println("Informe seu Estado:");
        var estado = entrada.nextLine();
        pessoaPj.setEstado(estado);

        System.out.println("Informe seu CEP:");
        var CEP = entrada.nextLine();
        pessoaPj.setCEP(CEP);

        System.out.println("Descrição da Empresa:");
        var DescricaoDaEmpresa = entrada.nextLine();
        pessoaPj.setDescricaoDaEmpresa(DescricaoDaEmpresa);
        listaPj.add(pessoaPj);
        return pessoaPj;

    }}