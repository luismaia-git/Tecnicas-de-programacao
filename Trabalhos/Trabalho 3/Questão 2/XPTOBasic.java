public class XPTOBasic extends Conta{ 
    
    XPTOBasic(int id){
        setId(id);
    }

    XPTOBasic(int id, float valor){
        setId(id);
        creditar(valor);
    }

    public String toString() {
        return "Tipo: XPTOBasic, Numero Identificador: " + id_num 
        + ", Saldo: " +getSaldo();
    }
}
