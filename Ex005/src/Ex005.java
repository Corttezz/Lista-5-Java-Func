import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) throws Exception {
        double custo, taxaImposto;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o custo do produto sem os impostos: ");
        custo = tc.nextDouble();

        System.out.println("Digite a taxa de imposto em porcentagem: ");
        taxaImposto = tc.nextDouble();
        somaImposto(taxaImposto, custo);
        tc.close();
    }

    public static void somaImposto(Double taxaImposto, Double custo) {
        custo  = custo * (1 - (taxaImposto / 100));    
       System.out.println("O novo custo do produto com " + taxaImposto + "% de taxa de imposto é de: " + custo);
    }
}
