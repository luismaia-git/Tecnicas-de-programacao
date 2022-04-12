
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
            try {
                if(this.saldo < valor){
                    System.out.println("Não tem saldo suficiente para o saque deste valor");
                } else{
                    this.saldo -= valor;
                }
            } catch(Exception erro) {
                System.out.println("Não é possivel sacar dinheiro da conta pois ela não existe");
            }
            
        }

        void depositar(float valor) {
            try {
                this.saldo += valor;
            } catch(Exception erro) {
                System.out.println("Não é possivel depositar dinheiro na conta pois ela não existe");
            }
        }

        void visualizarSaldo() {
            try {
                System.out.println("Saldo disponivel: "+ this.getSaldo());
            } catch(Exception erro){
                System.out.println("Não é possivel visualizar o saldo da conta pois ela não existe");
            }
            
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
