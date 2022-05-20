public abstract class Conta {
    int id_num;
    float saldo;


    void setId(int id) {
        this.id_num = id;
    }  

    int getId() {
        return id_num;
    }

    float getSaldo() {
        return this.saldo;
    }

    public void creditar(float valor){
        this.saldo += valor;
    }

    public void debitar(float valor){
        this.saldo -= valor;
    }

    public void visualizarSaldo(){
        System.out.println("Saldo: " + getSaldo());
    }

}
