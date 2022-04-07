
public class Cliente {
	Conta [] contas = new Conta[100];
	int id;
    String nome;
	String cpf;
	int idade;



    Cliente(String nome, String cpf, int idade){
        this.id++;
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

        for (Conta conta : contas) {
            //System.out.println("estou em fechar conta cliente, numero da conta"+ conta.getNumConta());
            if(conta != null){
                if(conta.getNumConta() == c.getNumConta()){
                    
                    conta = null;
                }
            }
            
        }
        System.out.println("Conta encerrada no array de cliente++++++");
	    
	}

}