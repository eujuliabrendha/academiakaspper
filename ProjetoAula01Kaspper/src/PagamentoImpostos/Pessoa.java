package PagamentoImpostos;

public abstract class Pessoa implements PessoaInterface {
	
//superClass	
	
	private String nome;
	private double rendaAnual;
	
	
	public Pessoa(String nome, double rendaAnual) {
//		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	
}
