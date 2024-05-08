package ecommecer.repository;

import ecommecer.model.Produtos;

public interface EcommecerRepository {
	
	// CRUD da Conta
		public void procurarPorId(int id);
		public void listarTodas();
		public void cadastrar(Produtos produto);
		public void atualizar(Produtos produto);
		public void deletar(int id);
		
		

}
