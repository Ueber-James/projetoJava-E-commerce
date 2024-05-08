package ecommecer.model;

public class Produtos {

	private int id;
		
	private String nome;
	
	private String tipo;
	
	private float preco;
	
	private String marca;
	
	private int quantidade;
	
	
	



	public Produtos(int id, String nome, String tipo, float preco, String marca, int quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.marca = marca;
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	} 
	
	public void visualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
	}
	
	
	
	
}
