public abstract class Veiculo {
    private String modelo;
    private double valorTabela;
    private String cor;
    private String combustivel;
    private double ipva;

    // GET
    public String getModelo() {
        return this.modelo;
    }

    public double getValorTabela() {
        return this.valorTabela;
    }

    public String getCor() {
        return this.cor;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public Double getIpva() {
        return this.ipva;
    }

    // SET
    public void setModelo(String x) {
        this.modelo = x;
    }

    public void setValorTabela(Double x) {
        this.valorTabela = x;
    }

    public void setCor(String x) {
        this.cor = x;
    }

    public void setCombustivel(String x) {
        this.combustivel = x;
    }

    public void setIpva(double x) {
        this.ipva = x;
    }

    // METEODOS
    public void calculaIpva() {

    }

    public void imprimirFicha() {
        calculaIpva();
        System.out.printf("Modelo: ", this.modelo, "\n", "Valor tabela: ", this.valorTabela, "\n", "Cor: ", this.cor,
                "\n", "Combustivel: ", this.combustivel, "\n", "Ipva: ", this.ipva, "\n");
    }
}
