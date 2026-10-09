package br.edu.fatecpg.atividadealeterceiro.view;

import java.util.Scanner;
import br.edu.fatecpg.atividadealeterceiro.model.PostoCombustivel;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PostoCombustivel posto = new PostoCombustivel();
        int opcao;

        do {
        	System.out.println("=== Posto Combustível ===");
            System.out.println("\n1-Monitoramento");
            System.out.println("2-Patrimônio");
            System.out.println("3-Inventário");
            System.out.println("4-Vender");
            System.out.println("5-Reabastecer");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    posto.monitoramento();
                    break;
                case 2:
                    posto.patrimonio();
                    break;
                case 3:
                    posto.inventario();
                    break;
                case 4:
                    System.out.println("Índice (0-Gasolina, 1-Etanol, 2-Diesel):");
                    int i = sc.nextInt();
                    System.out.println("Litros para vender:");
                    int q = sc.nextInt();

                    if (i >= 0 && i < 3) {
                        posto.vender(i, q);
                    }
                    break;
                case 5:
                    System.out.println("Índice (0-Gasolina, 1-Etanol, 2-Diesel):");
                    i = sc.nextInt();
                    System.out.println("Litros para adicionar:");
                    q = sc.nextInt();

                    if (i >= 0 && i < 3) {
                        posto.reabastecer(i, q);
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}