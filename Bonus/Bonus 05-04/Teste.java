public class Teste {
    
    int qtdC;
    
    static Banco BB = new Banco("Banco do brasil", 001);

    public static void main(String[] args) {

        BB.cadastrarCliente("Luis", "123456", 21);
        BB.cadastrarCliente("Carlos","654321", 25);


        BB.criarConta(BB.clientes[1],"Corrente");

        BB.criarConta(BB.clientes[2],"Poupanca");

        BB.pesquisarConta(1); 
      
        BB.pesquisarCliente("123456");
      
        BB.contas[1].depositar(100);
        BB.listarCliente();

        
        BB.listarConta();


        BB.fecharConta(BB.contas[1]);


        BB.listarConta();

       
    }
}
