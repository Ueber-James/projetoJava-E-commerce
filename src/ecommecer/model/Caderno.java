package ecommecer.model;

public class Caderno extends Produtos {

	private String tipodefolha;

	

	public Caderno(int id, String nome,  float preco, String marca, int quantidade, String tipodefolha) {
		super(id, nome,  preco, marca, quantidade);
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
		super.visualizar();
		System.out.println("Tipo de folha: " + this.tipodefolha);
		
	}
	
	
	

	

	
	
}
