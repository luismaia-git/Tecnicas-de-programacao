public class Conjunto {
    
    private int valores[];
    private int qtdElemento = 0;
    
    Conjunto(int n){
        valores = new int[n];
    }


    public void inserir_elemento(int valor){

        for (int i = 0; i < this.qtdElemento; i++){
            if (this.valores[this.qtdElemento] == valor){
                return;
            }
        }

        this.valores[this.qtdElemento] = valor;
        qtdElemento++;
    }
    
    public void retornar_conjunto(){
        for (int i = 0; i < this.qtdElemento; i++){
            System.out.print( this.valores[i] + " ");
        }
    }

    public boolean verificar_pertinencia(int valor){
        for (int i = 0; i < this.qtdElemento; i++){
            if (valor == this.valores[i]){
                return true;
            }
        }
        return false;
    }



    public boolean subconjunto(Conjunto conj_aux){
        boolean pertence = false;

        for(int i = 0; i < conj_aux.qtdElemento; i++){
            for(int j = 0; j < this.qtdElemento; j++){
                if (conj_aux.valores[i] == this.valores[j]){
                    pertence = true;
                    j = this.qtdElemento;
                }else{
                    pertence = false;
                }
                
            }
           
        }

        return pertence;
    }

    public Conjunto uniao_conjunto(Conjunto conj_aux){

        Conjunto uniao = new Conjunto ( this.qtdElemento + conj_aux.qtdElemento);

        for (int i = 0; i < this.qtdElemento; i++){
            uniao.inserir_elemento(this.valores[i]);
            
        }

        for (int i = 0; i < conj_aux.qtdElemento; i++){
            uniao.inserir_elemento(conj_aux.valores[i]);
        }

        return uniao;

    }
   
    public Conjunto intersecao_conjunto(Conjunto conj_aux){

        Conjunto intersecao = new Conjunto (this.qtdElemento + conj_aux.qtdElemento);


        for (int i = 0; i < this.qtdElemento; i++){
            for (int j = 0; j < conj_aux.qtdElemento; j++){
                if (this.valores[i] == conj_aux.valores[j]){
                    intersecao.inserir_elemento(this.valores[i]);
                }
            }
        }

        return intersecao;

    }
   
    public Conjunto diferenca_conjunto(Conjunto conj_aux){
        Conjunto diferenca = new Conjunto( this.qtdElemento + conj_aux.qtdElemento);
        boolean diferente;
        

        for (int i = 0; i < this.qtdElemento; i++){

            diferente = true;

            for (int j = 0; j < conj_aux.qtdElemento; j++){
                if (this.valores[i] == conj_aux.valores[j]){
                    diferente = false;
                    j = conj_aux.qtdElemento;
                }
            }
            if (diferente){
                diferenca.inserir_elemento(this.valores[i]);
            }

        }

        return diferenca;

    }
}