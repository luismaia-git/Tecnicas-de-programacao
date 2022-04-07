import java.util.Scanner;

public class Banco {
    String nome;
	int codigo;
	Conta [] contas = new Conta[100];
	Cliente [] clientes = new Cliente[100];
	int indiceConta;
	int qtdCliente; //como nao tem opcao de excluir cliente, posso trabalhar com essa variavel
	int qtdContas;
	int auxN;
	int auxId;

	Scanner ler = new Scanner(System.in);

	Banco(String nome, int cod) {
		setNome(nome);
		setCodigo(cod);
	}

	Banco(String nome) {
		setNome(nome);
		this.codigo++;
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
		for (int i =0; i < contas.length; i++) {
			if(contas[i] != null && contas[i].getCliente() != null) { 
				if(c.getId() == contas[i].getClienteId()) {
					System.out.println("Não é possivel criar uma conta pois o cliente ja possui uma");
					return;
				}
			}	
		}
		
		if(c.getIdade() < 18) { //c é o menor de idade , entao eh o dependente
			System.out.println("Cliente menor de idade, não pode ser o titular conta");
			System.out.printf("Informe Cpf do cliente que será o titular da conta: \n");
			String cpf = ler.next();
			Cliente titular = ProcuraClienteArray(cpf);
			if(titular != null ){
				System.out.printf("Iniciando cadastro da conta do depedente %s com o titular %s\n", c.getNome(), titular.getNome());
				if(c != null) { //criando conta com titular maior de idade e setando o dependente
					indiceConta++;
					auxN++;
					System.out.println("Numero indiceConta " + indiceConta);
					c.contas [indiceConta] = new Conta(titular,tipo, this);
					c.contas[indiceConta].setNumConta(auxN);
					c.contas [indiceConta].setDependente(c);
					contas [indiceConta] = new Conta(titular,tipo, this);
					contas[indiceConta].setNumConta(auxN);
					contas [indiceConta].setDependente(c);
					qtdContas++;
					System.out.println("==========================================");
					System.out.println("Conta com dependente criada com sucesso!");
				}
			}
			

			

		} else { //cria conta normal, c é maior de idade
			indiceConta++;
			auxN++;
			c.contas [indiceConta] = new Conta(c,tipo, this);
			c.contas[indiceConta].setNumConta(auxN);
			contas [indiceConta] = new Conta(c,tipo, this);
			contas[indiceConta].setNumConta(auxN);
			qtdContas++;
			System.out.println("==========================================");
			System.out.println("Conta criada com sucesso!");
		}

		
		
	}

	void cadastrarCliente (String nome, String cpf, int idade) {
		for (Cliente cliente : clientes) {
			if(cliente != null && cliente.getCpf().equals(cpf)){
				System.out.println("==========================================");
				System.out.println("Não é possivel cadastrar o mesmo cliente");
				return;
			}
		}
		//cadastra o cliente
		qtdCliente++;
		auxId++;
		clientes[qtdCliente] = new Cliente(nome, cpf, idade);
		clientes[qtdCliente].setId(auxId);
		System.out.println("==========================================");
		System.out.println("Cliente cadastrado com sucesso!");
		
	}

	Cliente pesquisarCliente(String cpf){
		System.out.println("==========================================");
		for (Cliente cliente2 : clientes) {
			if (cliente2 != null) {
				if(cliente2.getCpf() == cpf) {
					System.out.printf("Cliente encontrado:\nNome: %s\nCPF: %s\nIdade: %s\n\n", cliente2.getNome(), cliente2.getCpf(), cliente2.getIdade());
					return cliente2;
				}
			}
		}
		System.out.println("Cliente nao encontrado\n");
		
		return null;
	}	
		
	Conta pesquisarConta(int numConta){
		System.out.println("==========================================");
		for (Conta conta2: contas) {
			if(conta2 != null) {
				if(conta2.getNumConta() == numConta && conta2.getCliente() != null) {
					System.out.printf("Conta encontrada:\nNumero da conta: %s\nTitular: %s\nSaldo: %s\n\n", conta2.getNumConta(), conta2.getCliente().getNome() , conta2.getSaldo() );
					return conta2;
				} 
			}
				
		}
		System.out.printf("Conta com numero %s nao foi encontrada\n", numConta);
		
		
		return null;
	}

	Cliente ProcuraClienteArray(String cpf) {
		for (Cliente cliente2 : clientes) {
			if (cliente2 != null) {
				if(cliente2.getCpf().equals(cpf)) {
					return cliente2;
				}
			}
		}
		return null;
	}
    
	void listarConta(){
		System.out.println("==========================================");
		System.out.printf("Lista de contas no %s:\n\n", this.getNomeBanco());
		int temConta = 0;
		for (Conta conta : contas) {
			if(conta != null){

				if(conta.getCliente() != null){
					if(conta.getDependente() == null){
						System.out.printf("Titular da conta: %s\nNumero da conta: %s\nSaldo: %s\nTipo: %s\n\n" , conta.getCliente().getNome(), conta.getNumConta(),conta.getSaldo(), conta.getTipo());
						temConta++;
					}else{
						System.out.printf("Titular da conta: %s\nDependente: %s\nNumero da conta: %s\nSaldo: %s\nTipo: %s\n\n" , conta.getCliente().getNome(),conta.getDependente().getNome(), conta.getNumConta(),conta.getSaldo(), conta.getTipo());
						temConta++;
					}

				} else {
					//System.out.printf("tem conta com cliente null, dados: id %s numero conta %s ", conta.getClienteId(), conta.getNumConta());
				}
				 
			}
			
		}
		if(temConta == 0) {
			System.out.println("Nenhuma conta encontrada\n");
		}
		return;
		
	}

	void listarCliente(){
		System.out.println("==========================================");
		System.out.printf("Lista de clientes no %s:\n", this.getNomeBanco());
		for (Cliente cliente : clientes) {
			if(cliente != null){
				System.out.printf("Nome: %s\nCpf: %s\nIdade: %s\n\n", cliente.getNome(), cliente.getCpf(), cliente.getIdade());
			} 
		}
		
    }
	
	void fecharConta (Conta c) {
		
		c.fecharConta();
		 // fechando a conta la no array de cliente;  
		for(int i=0; i < contas.length;i++)
            if(contas[i] != null){
                if(contas[i] == c){
					contas[i] = null;
					
				}
			}	
        	

		
		qtdContas--;
		
	}
}
