package cadastropessoas.com;

//Criando a classe Cliente/*
public class Cliente extends Pessoas {
	private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

  //Criando o construtor da classe Cliente/*
    public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento); // Chamando o construtor da classe Pessoas /*
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    // Criando os getters and setters da classe Cliente/*
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


