public class Sistema {
    int count;
    Conta contas[] = new Conta[100]; //polimorfismo de inclusao, o array de contas pode receber contas (filhas) XPTOBasic, Plus e Extreme.

    boolean verificaId(int id){

        for(Conta conta : contas){
            if(conta != null) {
                if(conta.getId() == id){
                    System.out.println("Conta com este id ja existe");
                    return true;
                } 
            }
             
        }
        return false;
        
    }

    void criarContaXPTOBasic(int id){
        if(!verificaId(id)){
            contas[count++] = new XPTOBasic(id); 
        };
    }

    void criarContaXPTOBasic(int id, float valor){ //sobrecarga
        if(!verificaId(id)){
            contas[count++] = new XPTOBasic(id, valor); 
        };
    }


    void criarContaXPTOPlus(int id){
        if(!verificaId(id)){
            contas[count++] = new XPTOPlus(id); 
        };
    }

    void criarContaXPTOPlus(int id, float valor){ //sobrecarga
        if(!verificaId(id)){
            contas[count++] = new XPTOPlus(id, valor); 
        };
    }

    void criarContaXPTOExtreme(int id){
        if(!verificaId(id)){
            contas[count++] = new XPTOExtreme(id); 
        };
    }
    
    void criarContaXPTOExtreme(int id, float valor){ //sobrecarga
        if(!verificaId(id)){
            contas[count++] = new XPTOExtreme(id); 
        };
    }  



    void creditar(int i, float valor){ 
        for(Conta conta : contas){
            if(conta != null){
                if(conta.getId()== i){
                    conta.creditar(valor);
                    return;
                } 
            }   
        }
        System.out.println("Conta nao encontrada");
    }

    void creditar(int i, int valor){ //coersao
        for(Conta conta : contas){
            if(conta != null){
                if(conta.getId()== i){
                    conta.creditar(valor);
                    return;
                } 
            }   
        }
        System.out.println("Conta nao encontrada");
    }

    void debitar(int i, float valor){ //coersao e sobrecarga

        for(Conta conta : contas){

            if(conta != null){
                if(conta.getId() == i){
                    conta.debitar(valor);
                    return;
                } 
            }   
        }
        System.out.println("Conta nao encontrada");
    }

    void consultarSaldo(int i){ //sobrecarga

        for(Conta conta : contas){

            if(conta != null){
                if(conta.getId() == i){
                    System.out.println("Saldo: " + conta.getSaldo());
                    return;
                }
            }   
        }
        System.out.println("Conta nao encontrada");
    }

    /*
    void mostrarContas(){

        for(Conta conta : contas){
            if(conta != null){
                System.out.println(conta.toString());
            }
            
        }
    }
    */
}
