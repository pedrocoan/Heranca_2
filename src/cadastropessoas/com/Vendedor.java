package cadastropessoas.com;


// Criando a classe vendedor e tranferindo os atributos e metodos da superclasse/*
public class Vendedor extends Pessoas {
	  private String dataContratacao;
	   private double salarioBase;
	   private double percentualComissao;

	  //Criando o construtor da classe vendedor/*
	 public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
	     super(nome, cpf, dataNascimento); //Usando o construtor da superclasse/*
	     this.dataContratacao = dataContratacao;
	     this.salarioBase = salarioBase;
	     this.percentualComissao = percentualComissao;
	    }

	    //Criando os getters and setters da classe vendedor/*
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

	    public double getPercentualComissao() {
	        return percentualComissao;
	    }

	    public void setPercentualComissao(double percentualComissao) {
	        this.percentualComissao = percentualComissao;
	    }
	}


