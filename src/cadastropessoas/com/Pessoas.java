package cadastropessoas.com;

//Criando a superclasse Pessoas e criando os atrubutos que vao ser usados em outras classes/*

public class Pessoas {
	private String nome;
	private String cpf;
	private String datanascimento;
	
	//Criando o construtor da superclasse/*
	public Pessoas(String nome, String cpf, String datanascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.datanascimento = cpf;
	}
	
	//Criando os getters and setters/*
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setdatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}
	
	public String getnome () {
		return nome;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public String getdatanascimento() {
		return datanascimento;
	}

}
