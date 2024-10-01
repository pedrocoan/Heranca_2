package cadastropessoas.com;

public class AplicacaoCadastroPessoas  {

	public static void main(String[] args) {
		 //Instanciando o Vendedor/*
        Vendedor vendedor = new Vendedor("João Silva", "123.456.789-00", "10/05/1990", "15/08/2020", 2500.00, 0.10);

        // Instanciando o Gerente/*
        Gerente gerente = new Gerente("Maria Souza", "987.654.321-00", "20/03/1985", "01/02/2018", 4500.00, "Vendas");

       //Instanciando Cliente/*
        Cliente cliente = new Cliente("Carlos Oliveira", "111.222.333-44", "25/12/1992", "carlos.oliveira@email.com", "CART12345", "(11) 99999-8888");

        //Mostrando na tela/*
        System.out.println("Vendedor: " + vendedor.getnome() + ", CPF: " + vendedor.getcpf() + ", Data de Nascimento: " + vendedor.getdatanascimento());
        System.out.println("Gerente: " + gerente.getnome() + ", CPF: " + gerente.getcpf() + ", Data de Nascimento: " + gerente.getdatanascimento());
        System.out.println("Cliente: " + cliente.getnome() + ", CPF: " + cliente.getcpf() + ", Email: " + cliente.getEmail());
    }


	}

