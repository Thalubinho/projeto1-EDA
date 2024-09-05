public class Testes {
    private long inicio;
    private long fim;
    private long duracao;
    private double duracaoMiliSegundos;

    public Testes(){
        this.inicio = System.nanoTime();
    }

    public long getInicio() {
        return this.inicio;
    }
    public long getFim() {
        return this.fim;
    }
    public void setFim() {
        this.fim = System.nanoTime();
    }
    public long getDuracao() {
        return this.duracao;
    }
    public void setDuracao() {
        this.duracao = this.fim - this.inicio;
    }
    public void setDuracaoMiliSegundos(){
        this.duracaoMiliSegundos = this.duracao / 1_000.0;
    }

    public double getDuracaoMiliSegundos(){
        setDuracaoMiliSegundos();
        return this.duracaoMiliSegundos;
    }
}
