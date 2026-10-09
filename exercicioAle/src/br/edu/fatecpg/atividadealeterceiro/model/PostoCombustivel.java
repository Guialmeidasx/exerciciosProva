package br.edu.fatecpg.atividadealeterceiro.model;

public class PostoCombustivel {

    String[] tipos = {"Gasolina", "Etanol", "Diesel"};
    double[] precos = {6.49, 4.29, 6.19};
    int[] litros = {5000, 3000, 8000};

    public void monitoramento() {
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(tipos[i] + ": " + litros[i] + " litros");
        }
    }

    public void patrimonio() {
        double total = 0;

        for (int i = 0; i < tipos.length; i++) {
            total += precos[i] * litros[i];
        }

        System.out.println("Patrimônio: R$ " + total);
    }

    public void inventario() {
        for (int i = 0; i < tipos.length; i++) {
            if (litros[i] <= 2000) {
                System.out.println(tipos[i] + ": estoque baixo");
            }
        }
    }

    public void vender(int indice, int quantidade) {
        if (quantidade > 0 && quantidade <= litros[indice]) {
            litros[indice] -= quantidade;
            System.out.println("Venda realizada!");
        } else {
            System.out.println("Estoque insuficiente ou quantidade inválida!");
        }
    }

    public void reabastecer(int indice, int quantidade) {
        if (indice >= 0 && indice < tipos.length
                && quantidade > 0
                && quantidade <= 10000 - litros[indice]) {
            litros[indice] += quantidade;
            System.out.println("Reabastecimento realizado!");
        } else {
            System.out.println("Operação inválida!");
        }
    }
}