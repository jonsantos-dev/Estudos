package entities;

public class Produto {
	
	private String nome;
	private String codigoIdentificador;
	private double preco;
	private int quantidadeEmEstoque = 0;
	
	public Produto(String nome, String codigoIdentificador, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.codigoIdentificador = codigoIdentificador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public void compra(int quantidade) {
		quantidadeEmEstoque += quantidade;
	}
	
	public void venda(int quantidade) {
		this.quantidadeEmEstoque -= quantidade;
	}
	
	public String infoProduto() {
		
		return String.format("%nDADOS DO PRODUTO%n%nNome: %s%nCodigo: %s%nPreco: %.2f%nQuantidade: %d%n", nome, codigoIdentificador, preco, quantidadeEmEstoque);
	}

}
