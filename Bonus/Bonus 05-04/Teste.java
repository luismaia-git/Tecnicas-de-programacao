public class Teste {
    
    int qtdC;
    
    static Banco BB = new Banco("Banco do brasil", 001);

    public static void main(String[] args) {

        BB.cadastrarCliente("Luis", "123456", 21); // em teoria era pra entrar na posicao 1 do arrray clientes de banco 
        BB.cadastrarCliente("Carlos","654321", 25); // posicao 2


        BB.criarConta(BB.clientes[0],"Corrente"); //era pra ser clientes[1] | era pra criar uma contas na posicao 1 do array contas da class banco e class cliente

        BB.criarConta(BB.clientes[1],"Poupanca"); //era pra ser clientes[2] | era pra criar uma conta posicao 2 do array de contas da class banco e class cliente

        BB.pesquisarConta(0);  //pesquiso a conta Luis --- era pra ser conta com num 1 pesquisarConta(1)
      
        BB.pesquisarCliente("123456"); //pesquiso o cliente Luis 
      
        BB.contas[0].depositar(100); // era pra eu depositar 100 na conta do Luis
        BB.listarCliente(); //lisntando clientes

        
        BB.listarConta(); // listando contas     ((NUMERO DAS CONTAS IGUAS???? WTF))


        BB.fecharConta(BB.contas[0]); //queria fechar a conta do Luis


        BB.listarConta(); //listando as contas

       BB.pesquisarConta(0); //checando se a conta foi apagada

       
    }
}
