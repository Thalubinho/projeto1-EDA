import algorithms.Merge;

public class Main {
    public static void main(String[] args) throws Exception {
        Dados dados = new Dados("test-array-3M-constante", 3000000);
        Runtime runtime = Runtime.getRuntime();
        
        long memoriaInicial, memoriaFinal, tempoInicial, tempoFinal;
        double memoriaGasta, duracaoMiliSegundos;

        tempoInicial = System.nanoTime();
        memoriaInicial = runtime.totalMemory() - runtime.freeMemory();        Merge.merge(dados.getArray());
        memoriaFinal = runtime.totalMemory() - runtime.freeMemory();
        tempoFinal = System.nanoTime();

        duracaoMiliSegundos = (tempoFinal - tempoInicial) / 1_000;
        memoriaGasta = (memoriaFinal - memoriaInicial) /  (1024.0 * 1024.0);

        System.out.printf("%.0f ms\n"+
                          "%.5f mb\n", duracaoMiliSegundos, memoriaGasta);
    }

    public static void printarArray(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("%d ", array[array.length -1]);
    }
}
