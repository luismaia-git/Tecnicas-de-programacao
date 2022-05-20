public class Teste2 {
    

    public static void main(String[] args) {
        Banco san = new Banco("Santander", 005);

        san.cadastrarCliente("Italo","12333", 21);

        Cliente Italo = san.ProcuraClienteArray("12333");
        san.criarConta(Italo, "Corrente");


        san.contas[1].depositar(100);

        san.listarConta();

        san.fecharConta(san.contas[1]);

        san.listarConta();

        //san.contas[1].depositar(100);

        san.pesquisarConta(1);

        san.criarConta(Italo, "Corrente");
    }
}
