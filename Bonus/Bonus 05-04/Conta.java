public class Conta {
        Banco banco;
        Cliente dono;
        float saldo;
        String tipo;
        int numConta;

        Conta(Cliente c, String tipo, Banco bank) {
            this.dono = c;
            this.tipo = tipo;
            this.saldo = 0;
            this.numConta++;
            this.banco = bank;
        }

        int getClienteId() {
            return this.dono.getId();
        }

        Cliente getCliente() {
            return this.dono;
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
            this.saldo -= valor;
        }

        void depositar(float valor) {
            this.saldo += valor;
        }
        
        
        void fecharConta () {
            dono.fecharConta(this);
            dono = null;
        }
    
}
