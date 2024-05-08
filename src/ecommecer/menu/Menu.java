package ecommecer.menu;
import java.util.InputMismatchException;
import java.util.Scanner;


import ecommece.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Luluzinha Papelari              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produtos                     ");
			System.out.println("            2 - Listar Produto           ");
			System.out.println("            3 - Buscar Prodoto              ");
			System.out.println("            4 - Atualizar Atualizar Produto            ");
			System.out.println("            5 - Apagar Produto                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
		
		
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
				
			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nSua Papelaria do coração");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Cadastrar Produto\n\n");
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar Produto\n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Prodoto \n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar Atualizar Produto\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar Produto \n\n");
				break;
		}
			
	}

}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Ueber James");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/Ueber-James/projetoJava-E-commerce");
		System.out.println("*********************************************************");
	}

}