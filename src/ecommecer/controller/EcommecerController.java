package ecommecer.controller;

import java.util.ArrayList;


import ecommecer.model.Produtos;
import ecommecer.repository.EcommecerRepository;

public class EcommecerController implements EcommecerRepository {
	
	 private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	    int numero = 0;

	@Override
	public void procurarPorId(int id) {

		
	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}        
		
	}

	@Override
	public void cadastrar(Produtos produto) {
		listaProdutos.add(produto);
		System.out.println("\nA Produto ID: " + produto.getId() + " foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(Produtos produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if(listaProdutos.remove(produto) == true)
				System.out.println("\nA o id numero: " + id + " foi deletada com sucesso!");
		}else
			System.out.println("\nA id numero: " + id + " não foi encontrada!");
		
	}
	
	public Produtos buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}

}
