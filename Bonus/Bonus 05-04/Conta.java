
public class Conta {
        Banco banco;
        Cliente dono;
        Cliente dependente;
        float saldo;
        String tipo;
        int numConta;

        Conta(Cliente c, String tipo, Banco bank) {
            this.dono = c;
            this.tipo = tipo;
            this.saldo = 0;
            this.banco = bank;
            
        }

        //set
        void setDependente(Cliente depen){
            this.dependente = depen;
        }
        
        //get

        int getClienteId() {
            return this.dono.getId();
        }

        Cliente getCliente() {
            return this.dono;
        }

        Cliente getDependente(){
            return this.dependente;
        }
        int getNumConta() {
            return this.numConta;
        }

        float getSaldo() {
            return this.saldo;
        }

        String getTipo() {
            return this.tipo;
        }


        //metodos
        void sacar(float valor) {
            
            if(this.saldo < valor){
                System.out.println("Não tem saldo suficiente para o saque deste valor");
            } else{
                this.saldo -= valor;
            }
        }

        void depositar(float valor) {
            this.saldo += valor;
        }

        void visualizarSaldo() {
            System.out.println("Saldo disponivel: "+ this.getSaldo());
        }
        
        void setNumConta(int n){
            this.numConta = n;
        }

        void fecharConta () {
            dono.fecharConta(this);
            dono = null;
            dependente = null;
        }
    
}
