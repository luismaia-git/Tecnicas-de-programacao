import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintStream;

public final class Sort {
    public static void main(String[] args) throws IOException {
        ArrayList<Double> valores = new ArrayList<>();
        lerArquivo(valores);
    }

    public static void lerArquivo(ArrayList<Double> valores) {
        try (BufferedReader b = new BufferedReader(new FileReader("random.txt"));) {
            for (String line = b.readLine(); line != null; line = b.readLine()) {
                Double valor;
                valor = Double.parseDouble(line.replaceAll("Generated : ", ""));
                valores.add(valor);
            }
            Collections.sort(valores); //ordenando os valores do arquivo
            gravarArquivo(valores); //salvando no arquivos os dados organizados
            System.out.println(valores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void gravarArquivo(ArrayList<Double> valores) {
        PrintStream p = null;
        File arquivo = new File("random.txt");
        try {
            p = new PrintStream(arquivo);
            for (int i = 0; i < 10; ++i) {
                p.println(valores.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (p != null) {
            p.close();
        }
    }
}