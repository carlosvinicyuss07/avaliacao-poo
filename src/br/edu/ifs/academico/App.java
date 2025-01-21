package br.edu.ifs.academico;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        menu.imprimir();
        System.out.print("Informe a opção desejada: ");
        int opcao = sc.nextInt();
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar um novo pássaro");
                    break;
                case 2:
                    System.out.println("Listar pássaros");
                    break;
                case 3:
                    System.out.println("Cadastrar um novo cão");
                    break;
                case 4:
                    System.out.println("Listar cães");
                    break;
                case 5:
                    System.out.println("Cadastrar um novo gato");
                    break;
                case 6:
                    System.out.println("Listar gatos");
                    break;
                case 7:
                    System.out.println("Cadastrar um novo urso");
                    break;
                case 8:
                    System.out.println("Listar ursos");
                    break;
                case 9:
                    System.out.println("Cadastrar uma nova cobra");
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
