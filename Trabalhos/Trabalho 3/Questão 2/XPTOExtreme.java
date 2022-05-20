public class XPTOExtreme extends Conta {
   

    XPTOExtreme(int id){
        setId(id);
    }

    XPTOExtreme(int id, float valor){
        setId(id);
        creditar(valor);
    }

    @Override
    public void debitar(float valor){
        valor -= valor*0.002f;
        this.saldo -= valor;
    }

    @Override
    public void creditar(float valor){
        valor += valor*0.002f;
        this.saldo += valor;
    }

    public String toString() {
        return "Tipo: XPTOExtreme, Numero Identificador: " + id_num 
        + ", Saldo: " +getSaldo();
    }
}
