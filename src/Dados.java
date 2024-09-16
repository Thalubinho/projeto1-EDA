import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dados {
    private final int array[];

    public int[] getArray() {
        return array;
    }

    public Dados(String nome, int qtd) {
        this.array = lerArquivoComoInt(nome, qtd);
    }

    public final long[] lerArquivoComoLong(String nome, int qtd) {
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
    
    public final int[] lerArquivoComoInt(String nome, int qtd) {
        String path = System.getProperty("user.dir") + File.separator + "database"
                          + File.separator + nome + ".txt";
        int data[] = new int[qtd];  // Array de int para armazenar grandes números

        try (BufferedReader arquivo = new BufferedReader(new FileReader(path))) {
            String number;
            int i = 0;
            while ((number = arquivo.readLine()) != null && i < qtd) {
                // Converter o número para int após remover espaços em branco
                data[i] = Integer.parseInt(number.trim());
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
