package cadastro;

public class principal {

	//ATRIBUTOS
	
	String nome;
	String apelido;
	String sala;
	int idade;
	
	
	
	
	public principal() {
		this.nome = "";
		this.apelido = "";
		this.sala = "";
		this.idade = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	

}
