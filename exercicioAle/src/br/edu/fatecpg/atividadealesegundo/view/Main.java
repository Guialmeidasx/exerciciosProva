package br.edu.fatecpg.atividadealesegundo.view;
import br.edu.fatecpg.atividadealesegundo.model.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Guilherme de Almeida");
        conta.setNumeroConta(12345);
        conta.setSaldo(1500.00);

        System.out.println("===== EXTRATO BANCARIO =====");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
    }
}
