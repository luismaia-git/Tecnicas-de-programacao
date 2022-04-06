
public class Banco {
    String nome;
	int codigo;
	Conta [] contas = new Conta[100];
	Cliente [] clientes = new Cliente[100];
	int qtdConta;
	int qtdCliente;


	Banco(String nome, int cod) {
		setNome(nome);
		setCodigo(cod);
		this.qtdConta++;
		this.qtdCliente++;
	}

	Banco(String nome) {
		setNome(nome);
		this.codigo++;
		this.qtdConta++;
		this.qtdCliente++;
	}

	//set 

	void setNome(String nome){
		this.nome = nome;
	}

	void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	//get

	String getNomeBanco(){
		return this.nome;
	}

	int getCodigo() {
		return this.codigo;
	}

	//metodos
	void criarConta (Cliente c, String tipo) {
		if(c != null) {
			contas [qtdConta++] = new Conta(c,tipo, this);
		} else {
			System.out.println("Cliente = null");
		}
		
	}

	void cadastrarCliente (String nome, String cpf, int idade) {

		clientes[qtdCliente++] = new Cliente(nome, cpf, idade);

	}

	Cliente pesquisarCliente(String cpf){
		for (Cliente cliente2 : clientes) {
			if (cliente2 != null) {
				if(cliente2.getCpf() == cpf) {
					System.out.printf("Cliente encontrado. Cpf do cliente: %s\n\n", cliente2.getCpf());
					return cliente2;
				}
			}
		}
		return null;
	}	
		
	Conta pesquisarConta(int numConta){
		for (Conta conta2: contas) {
			if(conta2 != null) {

				if(conta2.getNumConta() == numConta) {
					System.out.printf("Conta encontrada, numero da conta: %s\n\n", conta2.getNumConta());
					return conta2;
				} 
			}
		}
		return null;
	}
    
	void listarConta(){
		System.out.printf("Lista de contas no %s:\n", this.getNomeBanco());
		for (Conta conta : contas) {
			if(conta != null){

				if(conta.getCliente() != null){
					System.out.printf("Titular da conta: %s\nSaldo: %s\nTipo: %s\n\n" , conta.getCliente().getNome(), conta.getSaldo(), conta.getTipo());
				}
				 
			} 
		}
		System.out.println("====================================");
	}

	void listarCliente(){
		System.out.printf("Lista de clientes no %s:\n", this.getNomeBanco());
		for (Cliente cliente : clientes) {
			if(cliente != null){
				System.out.printf("Nome: %s\nCpf: %s\nIdade: %s\n\n", cliente.getNome(), cliente.getCpf(), cliente.getIdade());
			} 
		}
		System.out.println("====================================");
    }
	
	void fecharConta (Conta c) {
		
		if(c != null) {
			c.fecharConta();
			System.out.println("Conta encerrada");
		} else{
			System.out.println("Conta null");
		}
		
	}
}
