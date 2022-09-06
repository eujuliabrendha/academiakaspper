package Biblioteca;

public class Livro {

//	modificador de acesso: private, public, etc.
	
//	atributos/ caracteristicas do "livro":
	private String nome;
	private String autor;
	private int quantidadeLivro;
	private int quantLivrosDisponiveis;
	
// atributo final não pode ser modificado.	
	private final double valorEmpDiario = 3.10;
	
// generate constructer using fields:	
	public Livro(String nome, String autor, int quantidadeLivro) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.quantidadeLivro = quantidadeLivro;
		this.quantLivrosDisponiveis = quantidadeLivro;
	}
	
	
// metodo:	
	public void mostrarFicha() {
		System.out.println("O nome do livro é: " + this.nome);
		System.out.println("O nome do autor é: " + this.autor);
		System.out.println("Temos " + this.quantLivrosDisponiveis + " livros disponíveis.");
		System.out.println("---------------------------------------------------------------");
	
	
	}

// variavel com apenas dois valores	(true or false)
	public boolean verificarDisponibilidade() {
		if(this.quantLivrosDisponiveis > 0) {
			return true;
	}else {
		return false; }
	}
	
//	public String emprestarLivro() {
//		if(verificarDisponibilidade()) {
//			this.quantLivrosDisponiveis -= 1;
//			return "0 livro foi emprestado com sucesso.";
//		}else {
//			return "Não temos uma cópia disponível para empréstimo"; }
//	}
	
	public void emprestarLivro() {
		if(verificarDisponibilidade()) {
			this.quantLivrosDisponiveis -= 1;
			System.out.println("0 livro foi emprestado com sucesso.");
		}else {
			System.out.println("Não temos uma cópia disponível para empréstimo"); }
	}	
	
	public void devolverLivro() {
		if(this.quantLivrosDisponiveis < this.quantidadeLivro) {
			this.quantLivrosDisponiveis += 1;
			System.out.println("Livro devolvido com sucesso!");
			System.out.println("Agora temos " + this.quantLivrosDisponiveis + " livros disponíveis.");
		} else {
			System.out.println("Nenhuma cópia deste livro está sendo emprestado atualmente."); }
	}
		
	public double calcularValor(int quantDias) {
		if(this.quantLivrosDisponiveis < this.quantidadeLivro) {
			return quantDias * this.valorEmpDiario;
		} else { 
			System.out.println("Nenhuma cópia deste livro foi emprestada.");
			return 0;
		}
		
	}
	
	
//generate getters and setters:	(para validar algum atributo).
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidadeLivro() {
		return quantidadeLivro;
	}

	public void setQuantidadeLivro(int quantidadeLivro) {
		this.quantidadeLivro = quantidadeLivro;
	}

	public int getQuantLivrosDisponiveis() {
		return quantLivrosDisponiveis;
	}

	public void setQuantLivrosDisponiveis(int quantLivrosDisponiveis) {
		this.quantLivrosDisponiveis = quantLivrosDisponiveis;
	}
	
	
	
}
