package Financiamentos;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        double valorTotal = 2000.0;
        double entrada = 100.0;
        int prestacao = 12;

        if (entrada < valorTotal * 0.2) {
            System.out.println("A entrada deve ser pelo menos 20% do valor total");
        } else if (prestacao < 9) {
            System.out.println("O númro mínimo de parcelas deve ser 9");

        } else {
            Financiamneto f = new Financiamneto(valorTotal, entrada, prestacao);
            System.out.println(f.prestacao());
        }
    }
}