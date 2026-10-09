package br.edu.fatecpg.atividadeale.view;
	import br.edu.fatecpg.atividadeale.model.Celular;
	public class Main {
		public static void main(String[] args) {
			Celular celular = new Celular();
			celular.marca = "Apple";
			celular.modelo = "Iphone 15";
			celular.preco = 3.000;
			celular.estado = "Usado";
			celular.defeito = "Tela quebrada";
			
			System.out.println("=== Relatório do Aparelho ===");
			System.out.println("Marca: " + celular.marca);
			System.out.println("Modelo: " + celular.modelo);
			System.out.println("Preço(R$): " + celular.preco);
			System.out.println("Estado: " + celular.estado);
			System.out.println("Defeito: " + celular.defeito);
		}
	}

