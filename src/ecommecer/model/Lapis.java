package ecommecer.model;

public class Lapis extends Produtos {

	private String cor;
	
	
	

	public Lapis(int id, String nome, float preco, String marca, int quantidade, String cor) {
		super(id, nome,  preco, marca, quantidade);
		this.cor = cor;	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Cor do lapis: " + this.cor);
		
	}
	
}
