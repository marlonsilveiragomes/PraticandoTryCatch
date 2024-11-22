package Financiamentos;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        double valorTotal = 2000.0;
        double entrada = 500.0;
        int parcelas = 12;

        try {
            Financiamneto f = new Financiamneto(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}