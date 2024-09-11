import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dados {
    private final long array[];

    public long[] getArray() {
        return array;
    }

    public Dados(String nome, int qtd) {
        this.array = lerArquivo(nome, qtd);
    }

    public final long[] lerArquivo(String nome, int qtd) {
        String path = System.getProperty("user.dir") + File.separator + "database"
                          + File.separator + nome + ".txt";
        long data[] = new long[qtd];  // Array de long para armazenar grandes números

        try (BufferedReader arquivo = new BufferedReader(new FileReader(path))) {
            String number;
            int i = 0;
            while ((number = arquivo.readLine()) != null && i < qtd) {
                // Converter o número para long após remover espaços em branco
                data[i] = Long.parseLong(number.trim());
                i++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao extrair informações");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter número: " + e.getMessage());
            e.printStackTrace();
        }
        return data;
    }
}
