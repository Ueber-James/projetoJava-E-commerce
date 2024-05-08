package ecommecer;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommece.util.Cores;
import ecommecer.controller.EcommecerController;
import ecommecer.model.Caderno;
import ecommecer.model.Lapis;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao, id, quantidade, tipoproduto;
		float preco;
		String nome, tipo, marca;
		EcommecerController produtos = new EcommecerController();

		Caderno c1 = new Caderno(1, "caderno1", 10.0f, "generetaion", 10, "amasada");
		produtos.cadastrar(c1);

		Lapis c2 = new Lapis(2, "lapis1", 10.0f, "generetaion", 10, "azul");
		produtos.cadastrar(c2);

		produtos.listarTodas();

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************	");
			System.out.println("                                                    	");
			System.out.println("                Luluzinha Papelari                   	");
			System.out.println("                                                     	");
			System.out.println("*****************************************************	");
			System.out.println("                                                     	");
			System.out.println("            1 - Cadastrar Produtos                    	");
			System.out.println("            2 - Listar Produto                        	");
			System.out.println("            3 - Atualizar Produto            		");
			System.out.println("            4- Apagar Produto                         	");
			System.out.println("            5 - Sair                                   	");
			System.out.println("                                                        ");
			System.out.println("*****************************************************   ");
			System.out.println("Entre com a opção desejada:                             ");
			System.out.println("                                                     	" + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 5) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSua Papelaria do coração");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:

				System.out.println(Cores.TEXT_WHITE + "Cadastrar Produto\n\n");

				System.out.println("Digite o Numero do ID: ");
				id = leia.nextInt();
				System.out.println("Digite o Nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite o Preço: ");
				leia.skip("\\R?");
				preco = leia.nextFloat();
				System.out.println("Digite o Nome da Marca: ");
				leia.skip("\\R?");
				marca = leia.nextLine();

				System.out.println("Digite a quantidade: ");
				leia.skip("\\R?");
				quantidade = leia.nextInt();

				do {
					System.out.println("Digite o Tipo do Produto (1-Caderno ou 2-Lapis): ");
					tipoproduto = leia.nextInt();
				} while (tipoproduto < 1 && tipoproduto > 2);
				leia.nextLine();
				switch (tipoproduto) {
				case 1 -> {
					System.out.println("Digite o Tipo de Folha): ");
					tipo = leia.nextLine();
					produtos.cadastrar(new Caderno(id, nome, preco, marca, quantidade, tipo));
				}
				case 2 -> {
					System.out.println("Digite a Cor ");
					tipo = leia.nextLine();
					produtos.cadastrar(new Lapis(id, nome, preco, marca, quantidade, tipo));
				}
				}
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n\n");
				
				produtos.listarTodas();

                keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "atualizar produtos \n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Apagar produto\n\n");
	
				System.out.println("Digite o número da conta: ");
				id = leia.nextInt();
					
				produtos.deletar(id);

                keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar Produto \n\n");
				break;
			}

		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************	");
		System.out.println("Projeto Desenvolvido por: Ueber James						");
		System.out.println("Generation Brasil - generation@generation.org				");
		System.out.println("https://github.com/Ueber-James/projetoJava-E-commerce		");
		System.out.println("*********************************************************	");
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}