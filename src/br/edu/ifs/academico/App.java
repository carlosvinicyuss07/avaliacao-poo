package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Passaro> listaPassaros = new ArrayList<Passaro>();
        ArrayList<Cao> listaCaes = new ArrayList<Cao>();
        ArrayList<Gato> listaGatos = new ArrayList<Gato>();
        ArrayList<Urso> listaUrso = new ArrayList<Urso>();
        ArrayList<Cobra> listaCobras = new ArrayList<Cobra>();

        Menu menu = new Menu();
        menu.imprimir();
        System.out.print("Informe a opção desejada: ");
        int opcao = sc.nextInt();
        String nome;
        int idade;
        String especie;
        double peso;
        String genero;
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("***CADASTRAR UM NOVO PÁSSARO***");
                    Passaro passaro = new Passaro();
                    System.out.print("Nome: ");
                    nome = sc.next();
                    passaro.setNome(nome);
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    passaro.setIdade(idade);
                    System.out.print("Espécie: ");
                    especie = sc.next();
                    passaro.setEspecie(especie);
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    passaro.setPeso(peso);
                    System.out.print("Gênero: ");
                    genero = sc.next();
                    passaro.setGenero(genero);
                    System.out.print("Tipo de vôo: ");
                    String tipoDeVoo = sc.next();
                    passaro.setTipoDeVoo(tipoDeVoo);
                    System.out.print("Tamanho das asas: ");
                    double tamanhoAsas = sc.nextDouble();
                    passaro.setTamanhoAsas(tamanhoAsas);
                    System.out.print("Cor das penas: ");
                    String corDasPenas = sc.next();
                    passaro.setCorDasPenas(corDasPenas);
                    System.out.print("Canta? (S/N)");
                    char resp = sc.next().toUpperCase().charAt(0);
                    boolean canSing;
                    if (resp == 'S') {
                        canSing = true;
                    } else {
                        canSing = false;
                    }
                    passaro.setCanSing(canSing);
                    System.out.print("Velocidade do vôo (km/h): ");
                    double velocidadeVoo = sc.nextDouble();
                    passaro.setVelocidadeVoo(velocidadeVoo);
                    listaPassaros.add(passaro);
                    break;
                case 2:
                    System.out.println("Listar pássaros");
                    break;
                case 3:
                    System.out.println("***CADASTRAR UM NOVO CÃO***");
                    Cao cao = new Cao();
                    System.out.print("Nome: ");
                    nome = sc.next();
                    cao.setNome(nome);
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    cao.setIdade(idade);
                    System.out.print("Espécie: ");
                    especie = sc.next();
                    cao.setEspecie(especie);
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    cao.setPeso(peso);
                    System.out.print("Gênero: ");
                    genero = sc.next();
                    cao.setGenero(genero);
                    System.out.print("Raça: ");
                    String raca = sc.next();
                    cao.setRaca(raca);
                    System.out.print("Tamanho: ");
                    String tamanho = sc.next();
                    cao.setTamanho(tamanho);
                    System.out.print("Cor do pelo: ");
                    String corDoPelo = sc.next();
                    cao.setCorDoPelo(corDoPelo);
                    System.out.print("Obediente? (S/N)");
                    resp = sc.next().toUpperCase().charAt(0);
                    boolean obediente;
                    if (resp == 'S') {
                        obediente = true;
                    } else {
                        obediente = false;
                    }
                    cao.setObediente(obediente);
                    System.out.print("Habilidade de guarda? (S/N)");
                    resp = sc.next().toUpperCase().charAt(0);
                    boolean habilidadeGuarda;
                    if (resp == 'S') {
                        habilidadeGuarda = true;
                    } else {
                        habilidadeGuarda = false;
                    }
                    cao.setHabilidadeGuarda(habilidadeGuarda);
                    listaCaes.add(cao);
                    break;
                case 4:
                    System.out.println("Listar cães");
                    break;
                case 5:
                    System.out.println("***CADASTRAR UM NOVO GATO***");
                    Gato gato = new Gato();
                    System.out.print("Nome: ");
                    nome = sc.next();
                    gato.setNome(nome);
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    gato.setIdade(idade);
                    System.out.print("Espécie: ");
                    especie = sc.next();
                    gato.setEspecie(especie);
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    gato.setPeso(peso);
                    System.out.print("Gênero: ");
                    genero = sc.next();
                    gato.setGenero(genero);
                    System.out.print("Raça: ");
                    raca = sc.next();
                    gato.setRaca(raca);
                    System.out.print("Cor do pelo: ");
                    corDoPelo = sc.next();
                    gato.setCorDoPelo(corDoPelo);
                    System.out.print("Comportamento: ");
                    String comportamento = sc.nextLine();
                    gato.setComportamento(comportamento);
                    System.out.print("Habilidade de caça? (S/N)");
                    resp = sc.next().toUpperCase().charAt(0);
                    boolean habilidadeCaca;
                    if (resp == 'S') {
                        habilidadeCaca = true;
                    } else {
                        habilidadeCaca = false;
                    }
                    gato.setHabilidadeCaca(habilidadeCaca);
                    System.out.print("Ronrona em média quantas vezes por dia? ");
                    int quantidadeRonronar = sc.nextInt();
                    gato.setQuantidadeRonronar(quantidadeRonronar);
                    listaGatos.add(gato);
                    break;
                case 6:
                    System.out.println("Listar gatos");
                    break;
                case 7:
                    System.out.println("***CADASTRAR UM NOVO URSO***");
                    Urso urso = new Urso();
                    System.out.print("Nome: ");
                    nome = sc.next();
                    urso.setNome(nome);
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    urso.setIdade(idade);
                    System.out.print("Espécie: ");
                    especie = sc.next();
                    urso.setEspecie(especie);
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    urso.setPeso(peso);
                    System.out.print("Gênero: ");
                    genero = sc.next();
                    urso.setGenero(genero);
                    System.out.print("Cor do pelo: ");
                    corDoPelo = sc.next();
                    urso.setCorDoPelo(corDoPelo);
                    System.out.print("Pode nadar? (S/N)");
                    resp = sc.next().toUpperCase().charAt(0);
                    boolean canSwin;
                    if (resp == 'S') {
                        canSwin = true;
                    } else {
                        canSwin = false;
                    }
                    urso.setCanSwin(canSwin);
                    System.out.print("Tipo de focinho: ");
                    String tipoDeFocinho = sc.next();
                    urso.setTipoDeFocinho(tipoDeFocinho);
                    System.out.print("Tamanho: ");
                    tamanho = sc.next();
                    urso.setTamanho(tamanho);
                    listaUrso.add(urso);
                    break;
                case 8:
                    System.out.println("Listar ursos");
                    break;
                case 9:
                    System.out.println("***CADASTRAR UMA NOVA COBRA***");
                    Cobra cobra = new Cobra();
                    System.out.print("Nome: ");
                    nome = sc.next();
                    cobra.setNome(nome);
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    cobra.setIdade(idade);
                    System.out.print("Espécie: ");
                    especie = sc.next();
                    cobra.setEspecie(especie);
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    cobra.setPeso(peso);
                    System.out.print("Gênero: ");
                    genero = sc.next();
                    cobra.setGenero(genero);
                    System.out.print("Ambiente principal: ");
                    String ambientePrincipal = sc.next();
                    cobra.setAmbientePrincipal(ambientePrincipal);
                    System.out.print("Venenosa? (S/N)");
                    resp = sc.next().toUpperCase().charAt(0);
                    boolean venenosa;
                    if (resp == 'S') {
                        venenosa = true;
                    } else {
                        venenosa = false;
                    }
                    cobra.setVenenosa(venenosa);
                    System.out.print("Peçonhenta? (S/N)");
                    resp = sc.next().toUpperCase().charAt(0);
                    boolean peconhenta;
                    if (resp == 'S') {
                        peconhenta = true;
                    } else {
                        peconhenta = false;
                    }
                    System.out.print("Padrão de pele: ");
                    String padraoDePele = sc.next();
                    cobra.setPadraoDePele(padraoDePele);
                    cobra.setPeconhenta(peconhenta);
                    listaCobras.add(cobra);
                    break;
                case 10:
                    System.out.println("Listar cobras");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
            menu.imprimir();
            System.out.print("Informe a opção desejada: ");
            opcao = sc.nextInt();
        }
        System.out.println("SAINDO...");
        sc.close();
    }
}
