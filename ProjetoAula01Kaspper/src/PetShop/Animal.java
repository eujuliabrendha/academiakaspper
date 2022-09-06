package PetShop;

public class Animal {

// modificadoes de acesso: private, public, default, protected;
// atributos (oq eles sao):
	
		private String nome;
		private String especie;
		private int idade;
			
// 		construtor:
		public Animal(String nome, String especie, int idade) {
			this.nome = nome;
			this.especie = especie;
			this.idade = idade;
			
			
		}
		
	
// metodos (oq eles fazem):

		
		public void vacinar() {
			System.out.println("O animal foi vacinado.");
			
		}
		
		public void consultar() {
			System.out.println("O animal foi consultado.");
			
		}
		
		public void fazeraniversario() { 
			System.out.println("O animal est� fazendo anivers�rio!!!");
			
		}

// get � pra fazer a leiura de dados/ leitura do conte�do de um atributo:
		
		public String getNome() {
			return nome;
		}

// set � pra inserir ou modificar o conte�do de um atributo;
		
		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEspecie() {
			return especie;
		}


		public void setEspecie(String especie) {
			this.especie = especie;
		}


		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
	        if (idade > 0) {

	        this.idade = idade;
	        System.out.println("A idade agora � " + this.idade);

	        } else {
	            System.out.println("N�o existe idade negativa");
	        }
	    }
	}