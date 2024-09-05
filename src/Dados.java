import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dados {
    private long array[];

    public long[] getArray() {
        return array;
    }

    public Dados(String nome, int qtd) {
        this.array = lerArquivo(nome, qtd);
    }

    public long[] lerArquivo(String nome, int qtd) {
        String caminho = "C:\\Users\\sonal\\Documents\\vs projects\\projeto1-EDA\\src\\database"
                          + File.separator + nome + ".txt";
        long dados[] = new long[qtd];  // Array de long para armazenar grandes números

        try (BufferedReader arquivo = new BufferedReader(new FileReader(caminho))) {
            String numero;
            int i = 0;
            while ((numero = arquivo.readLine()) != null && i < qtd) {
                // Converter o número para long após remover espaços em branco
                dados[i] = Long.parseLong(numero.trim());
                i++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao extrair informações");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter número: " + e.getMessage());
            e.printStackTrace();
        }
        return dados;
    }
}
