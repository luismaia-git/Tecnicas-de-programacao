
//Questão 03
// Compilado com sucesso

public class Pessoa {
    
    // Atributos da classe pessoa
    private String nome;
    private int idade;


    //Questão 07

    // Método construtor que inicia com vazio
    Pessoa(){ 
        this("NULL", 0);
    }

    // Construtor que inicia com nome e idade
    Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    
    // Método que "seta" o nome da Pessoa
    void setNome(String nome){
        this.nome = nome;
    }

    // Método que retorna o nome da Pessoa
    String getNome(){
        return this.nome;
    }

    //Questao 05

    // Método set atribui a idade da Pessoa
    void setIdade(int idade){
        this.idade = idade;
    }

    // Método get que retorna a idade da pessoa
    int getIdade(){
        return this.idade;
    }

    // Método que retorna uma string formatada com o nome e a idade da pessoa
    String retornar_dados(){
        String resultado = "NOME: " + this.nome + ",IDADE:" + this.idade;
        return resultado;
    }

}
