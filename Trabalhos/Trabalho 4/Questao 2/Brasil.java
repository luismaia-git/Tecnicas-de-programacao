import java.util.HashMap;
import java.util.Map;

public class Brasil {
    public static void main(String args[]){

        Map<String,String> estados = new HashMap<>();

        estados.put("AC", "Acre");
        estados.put("AL","Alagoas");
        estados.put("AP","Amapá");
        estados.put("AM","Amazonas");
        estados.put("BA","Bahia");
        estados.put("CE","Ceará");
        estados.put("ES","Espirito Santo");
        estados.put("GO","Goias");
        estados.put("MA","Maranhão");
        estados.put("MT","Mato Grosso");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("MG","Minas Gerais");
        estados.put("PA","Pará");
        estados.put("PB","Paraíba");
        estados.put("PR","Paraná");
        estados.put("PE","Pernambuco");
        estados.put("PI","Piaui");
        estados.put("RJ","Rio de Janeiro");
        estados.put("RN","Rio Grande do Norte");
        estados.put("RS","Rio Grande do Sul");
        estados.put("RO","Rondônia");
        estados.put("RR","Roraima");
        estados.put("SC","Santa Catarina");
        estados.put("SP","São Paulo");
        estados.put("SE","Sergipe");
        estados.put("TO","Tocantins");
        estados.put("DF","Distrito Federal");
        String state="";

        try{

            state=args[0];
            String estadoNome=estados.get(state.toUpperCase());
            System.out.println(state+" -> "+estadoNome);
        
        }catch(NullPointerException|IndexOutOfBoundsException e){
            
            System.out.println("chave não encontrada");
       
        }
    }
}