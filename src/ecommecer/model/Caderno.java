package ecommecer.model;

public class Caderno extends Produtos {

	private String tipodefolha;

	

	public Caderno(int id, String nome, String tipo, float preco, String marca, int quantidade, String tipodefolha) {
		super(id, nome, tipo, preco, marca, quantidade);
		this.tipodefolha = tipodefolha;
	}

	public String getTipodefolha() {
		return tipodefolha;
	}

	public void setTipodefolha(String tipodefolha) {
		this.tipodefolha = tipodefolha;
	}

	
	@Override
	public void visualizar() {
		System.out.println("Tipo de folha: " + this.tipodefolha);
		
	}
	
	
	

	

	
	
}
