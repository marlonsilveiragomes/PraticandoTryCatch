package Financiamentos;

public class Financiamneto {
    public double valorTotal;
    public double entrada;
    public Integer parcelas;

    public Financiamneto (Double valorTotal, Double entrada, Integer parcelas) {
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao() {
        return (valorTotal - entrada) / parcelas;
    }

}
