package Programa;



public class Pessoa {
	
	private static int count = 0;
	
	private String nome;
	private String cpf;
	private String email;
	//Constructor de Pessoa
	public Pessoa(String nome, String cpf, String email) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		
		count += 1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String mostrarPessoa() {
		return "/nNome: " + this.getNome() +
				"/nCPF: " + this.getCpf() +
				"/nEmail: " + this.getEmail();
		
	}
	
	
	
	

}
