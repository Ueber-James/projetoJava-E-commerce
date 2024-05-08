package ecommecer.model;

public class Lapis extends Produtos {

	private String cor;
	
	
	

	public Lapis(int id, String nome, String tipo, float preco, String marca, int quantidade, String cor) {
		super(id, nome, tipo, preco, marca, quantidade);
		this.cor = cor;	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	@Override
	public void visualizar() {
		System.out.println("Cor do lapis: " + this.cor);
		
	}
	
}
