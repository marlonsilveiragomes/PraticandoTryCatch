package Financiamentos;

public class Financiamneto {
    public double valorTotal;
    public double entrada;
    public Integer parcelas;

    public Financiamneto(Double valorTotal, Double entrada, Integer parcelas) {

        if (entrada < valorTotal * 0.2) {
            throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
        } else if (parcelas < 9) {
            throw new RuntimeException("O númro mínimo de parcelas deve ser 9");
        }


        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao() {
        return (valorTotal - entrada) / parcelas;
    }

}
