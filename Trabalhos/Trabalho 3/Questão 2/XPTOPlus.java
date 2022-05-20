public class XPTOPlus extends Conta{
    
    XPTOPlus(int id){
        setId(id);
    }
    

    XPTOPlus(int id, float valor){
        setId(id);
        creditar(valor);
    }

    @Override
    public void creditar(float valor){
        valor += valor*0.005f;
        this.saldo += valor;
    }

    public String toString() {
        return "Tipo: XPTOPlus, Numero Identificador: " + id_num 
        + ", Saldo: " +getSaldo();
    }
}
