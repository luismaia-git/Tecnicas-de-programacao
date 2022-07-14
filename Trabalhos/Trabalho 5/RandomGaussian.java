import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public final class RandomGaussian {
    public static void main(String...aAStrings) {
        RandomGaussian gaussian = new RandomGaussian();
        double MEAN = 100.0f;
        double VARIANCE = 5.0f;

        try (
            FileWriter criadorArquivo = new FileWriter("random.txt", false);
            BufferedWriter buffer = new BufferedWriter(criadorArquivo);
            PrintWriter escritorArquivos = new PrintWriter(buffer);
        ) { 
            for (int idx = 1; idx <= 10; idx++) {
                //saída desta classe seja gravada em um arquivo
                escreverTexto(String.valueOf(gaussian.getGaussian(MEAN, VARIANCE))+ "\n" , escritorArquivos);
            }
            //ler o arquivo gerado e apresentá-lo na saída padrão.
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        
        LerArquivo();
    }
    private Random fRandom = new Random();
    private double getGaussian(double aMean, double aVariance) {
        return aMean + fRandom.nextGaussian()*aVariance;
    }

    /*
    private static void log(Object aMsg) {
        System.out.println(String.valueOf(aMsg));
    }*/

    private static void escreverTexto( String pTextoEscrever, PrintWriter EA) {
        EA.append(pTextoEscrever);
    }

    private static void LerArquivo() {
        try (
            BufferedReader bufferLer = new BufferedReader(new FileReader("random.txt"));
        ) {
            String linha = "";
            while ((linha = bufferLer.readLine()) != null) {
                System.out.println(linha + " linha");
             } 
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }


                

}


/* private static void ApagarConteudo(){
        try (
            BufferedReader b = new BufferedReader(new FileReader("random.txt"));
        ) {

            for (String line = b.readLine(); line != null; line = b.readLine()) {

                valor = Double.parseDouble(line.replaceAll("Generated : ", ""));

            }
        }
        catch(IOException e) {
                e.printStackTrace();
            }
        
        } */