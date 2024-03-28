package view;

public class Produto {
	public int qtdEstoque;
	public String nome;
	public double preco;
	
	
	public Produto(String nome) {
		this.qtdEstoque = 0;
		this.nome = nome;
		this.preco = 0;
	};

	public String getNome(){
		return nome;
	};
	public double getPreco(){
		return preco;
	};
	public double getQtdEstoque(){
		return qtdEstoque;
	};
	
	public void setNome(String nome){
		this.nome = nome;
	};
	
	public void setCargo(double preco) {
		if(preco> 0) {
			this.preco = preco;
		};
	};
	
	public void setQtdEstoque(int qtdEstoque) {
		if(qtdEstoque> 0) {
			this.qtdEstoque = qtdEstoque;
		};
	};
	
	
	public boolean verificaProdutoDisponível() {
		return (this.qtdEstoque>0);
	};
	
	public double totalValorEstoque() {
		return (this.preco * this.qtdEstoque);
	};
	
	
}