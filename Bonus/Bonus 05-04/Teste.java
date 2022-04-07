public class Teste {
    
    int qtdC;
    

    public static void main(String[] args) {
        Banco BB = new Banco("Banco do brasil", 001);

        BB.cadastrarCliente("Luis", "123456", 21); // em teoria era pra entrar na posicao 1 do arrray clientes de banco 
        BB.cadastrarCliente("Carlos","654321", 25); // posicao 2


        BB.criarConta(BB.clientes[1],"Corrente"); //era pra ser clientes[1] | era pra criar uma contas na posicao 1 do array contas da class banco e class cliente

        BB.criarConta(BB.clientes[2],"Poupanca"); //era pra ser clientes[2] | era pra criar uma conta posicao 2 do array de contas da class banco e class cliente

        BB.pesquisarConta(1);  //pesquiso a conta Luis --- era pra ser conta com num 1 pesquisarConta(1)
      
        BB.pesquisarCliente("123456"); //pesquiso o cliente Luis 
      
        BB.contas[1].depositar(100); // era pra eu depositar 100 na conta do Luis
        BB.listarCliente(); //lisntando clientes

        
        BB.listarConta(); // listando contas     ((NUMERO DAS CONTAS IGUAS???? WTF))


        BB.fecharConta(BB.contas[1]); //queria fechar a conta do Luis

        


        BB.listarConta(); //listando as contas

        BB.criarConta(BB.clientes[1],"Corrente"); // recadastrando           PROBLEMA AQUI

        BB.listarConta();
        
        BB.pesquisarConta(1); //checando se a conta foi apagada


        //Teste em outro banco
        Banco nuB = new Banco("Nubank", 002);

        nuB.cadastrarCliente("Jose", "22222", 30);
        nuB.cadastrarCliente("Maria", "33333", 23);

        nuB.cadastrarCliente("Guilherme", "23322", 17);
        nuB.cadastrarCliente("GuilhermeMaia", "23322", 17);

        
        nuB.listarCliente();
        nuB.listarConta();

        Cliente Jose = nuB.ProcuraClienteArray("22222");
        //Cliente Gui = nuB.ProcuraClienteArray("23322");

        //nuB.criarConta(Gui, "Digital");
        nuB.criarConta(Jose, "Digital");
        nuB.listarConta();

        //nuB.contas[4].depositar(100);


       
    }
}
