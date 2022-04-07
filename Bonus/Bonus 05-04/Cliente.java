
public class Cliente {
	Conta [] contas = new Conta[100];
	int id;
    String nome;
	String cpf;
	int idade;



    Cliente(String nome, String cpf, int idade){
        setNome(nome);
        setCpf(cpf); 
        setIdade(idade);
        
    }


	//set
    void setNome(String name){
        this.nome = name;
    }

    void setCpf(String Cpf){
        this.cpf = Cpf;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    void setId(int valor) {
        this.id = valor;
    }
    //get
    int getId(){
        return this.id;
    }

    String getNome(){
        return this.nome;
    }
    
    String getCpf(){
        return this.cpf;
    }

    int getIdade(){
        return this.idade;
    }

    //metodos

    
	void fecharConta(Conta c){

        String nomeCli = "";
		int numConta = 0;

        System.out.println("==========================================");
        System.out.println("Solicitação de encerramento da conta aceito. Executando ação...");

        for (Conta conta : contas) {
            
            if(conta != null){
                if(conta.getNumConta() == c.getNumConta()){
                    nomeCli = c.getCliente().getNome();
					numConta = c.getNumConta();
                    conta = null;
                }
            }
            
        }

        System.out.printf("Conta com o numero %s do cliente %s foi encerrada com sucesso!\n", numConta, nomeCli);
		
	    
	}

}