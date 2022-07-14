import java.util.List;
import java.util.ArrayList;

public class Conjunto {
    
    //Declaração
    //Questão 13 
    //Classe Object: base para todas as classes, Object define alguns comportamentos comuns que todos objetos devem ter,
    private List <Object> valores;

    //Construtores

    //Construtor que iniciar um array vazio
    public Conjunto(){
        this.valores =  new ArrayList<Object>();
    }

    //Contrutor que inicia o objeto com uma lista já definida
    public Conjunto(List<Object>valores){
        this.valores = valores;
    }
    
    //Método que adiciona um novo elemento no conjunto
    public void adicionarElemento(Object valor){
        if (!this.valores.contains(valor)){ // a função contains verifica se o novo valor já pertence ao conjunto
            this.valores.add(valor); // se o valor não pertencer ele adiciona
        }
    }

    // Método que imprime na tela todos os valores do conjunto
    public void retornarElementos(){
        for (Object valor : this.valores){
            System.out.print("{" + valor + "} ");
        }
    }

    //Método para cálcular a interseção entre dois conjuntos
    public Conjunto intersecaoConjunto (Conjunto conj_2){

        Conjunto intersecao = new Conjunto(); // Conjunto auxiliar criado para guardar os valores do novo conjunto gerado

        for (Object v1 : this.valores){
            for(Object v2 : conj_2.valores){
                if (v1.equals(v2)){ // Caso o valor verificar em v1 seja igual ao de v2 ele vai para a intersecao
                    intersecao.adicionarElemento(v1); // adicionado na intersecao
                }
            }
        }

        return intersecao; // retorna o novo conjunto
    }

    //Método para retornar a uniao entre dois conjuntos
    public Conjunto uniaoConjunto (Conjunto conj_2){
        Conjunto uniao = new Conjunto(); // Conjuto auxiliar que vai guardar os novos valores

        for (Object valor : this.valores){
            uniao.adicionarElemento(valor); // adiciona todos os elementos de primeiro conjunto no conjunto novo
        }

        for (Object valor : conj_2.valores){
            uniao.adicionarElemento(valor); // adiciona todos os elementos de segundo conjunto no conjunto novo
        }

        return uniao; // retorna a uniao
    }

    // Método para verificar se um valor pertence a um conjunto
    public boolean pertinenciaConjunto (Object valor){
        if (this.valores.contains(valor)){ // a funcao contains verifica se o valor já está presente no conjunto
            return true; // se sim, retorna true
        }
        return false; // se não, retorna false
    }

    //Método para verificar se o conjunto passada como parametro é subconjunto do objeto que chamou o método
    public boolean subconjunto (Conjunto conj_2){
    
        if (this.valores.containsAll(conj_2.valores)) // a função containsAll verifica se todos os elementos do conjunto 2 está no conjunto 1
            return true; // se sim, retorna true
   
        return false; // se não, retorna false
    }

    //Método que retorna a diferença entre o conjunto 1 e o conjunto 2
    public Conjunto diferencaConjunto (Conjunto conj_2){
        Conjunto diferenca = new Conjunto(); // auxiliar criada para armazenar o resultado da difereca

        for (Object valor : this.valores){
            if(!conj_2.valores.contains(valor)){ // verifica se algum valor do conjunto 1 não está no conjunto 2
                diferenca.adicionarElemento(valor); // se sim, ele adiciona no auxiliar
            }
        }

        return diferenca; // retorna a diferenca
    }

    //Método que retorna o produto cartesiano do conjunto 1 com o conjunto 2
    public Conjunto produtoConjunto (Conjunto conj_2){
        
        Conjunto produto = new Conjunto(); // auxiliar criada para armazenar o resultado do produto

        //Percorre os dois conjuntos por completo
        for (Object v1 : this.valores){
            for (Object v2 : conj_2.valores){
                String parOrdenado = "("+ v1 + "," + v2 + ")"; // variavel auxiliar criada para formatar o par ordenado
                produto.adicionarElemento(parOrdenado); // adiciona esse "par ordenado" ao conjunto auxiliar
            }
        }

        return produto; // retorna produto
    }

}
