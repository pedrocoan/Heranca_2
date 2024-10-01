package cadastropessoas.com;

// Criando a classe gerente/*
public class Gerente extends Pessoas {
	private String dataContratacao;
    private double salarioBase;
    private String departamento;

   //Criando o construtor da classe gerente e chamando o construtor da classe pessoas/*
    public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento); 
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

   //Criando os getters and setters da classe Gerente/*
    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}


