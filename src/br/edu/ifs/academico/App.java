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
