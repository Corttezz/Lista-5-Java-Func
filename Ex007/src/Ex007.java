import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) throws Exception {
        double prestacao, diasAtraso, valor, valorTotal; 
        int totalPestrações;

        Scanner tc = new Scanner(System.in);
        prestacao = 1;
        valorTotal = 0;
        totalPestrações = 0;

        while (prestacao > 0) {
            System.out.println("Qual o valor da prestação?");
            prestacao = tc.nextDouble();
            if(prestacao > 0){
            System.out.println("Quantos dias de atraso?");
            diasAtraso = tc.nextDouble();
            valor = valorPagamento(prestacao, diasAtraso);
            System.out.println("O valor a ser pago é de " + valor);
            valorTotal = valorTotal + valor;
            totalPestrações ++;
            }else{
                System.out.println("Não exite mais prestações.");
                System.out.println("O valor total de " +totalPestrações+ " prestações é de "+ valorTotal);
            }
        }
        tc.close();
    }

    public static double valorPagamento(double prestacao, double diasAtraso) {
        double valor;
        valor = (prestacao * (1.03 * (1 + (0.001 * diasAtraso))));
        return valor;
    };
}
