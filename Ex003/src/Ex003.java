import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) throws Exception {
       int n1, n2, n3;
       try (Scanner tc = new Scanner(System.in)) {
        System.out.println("Digite o primeiro número: ");
           n1 = tc.nextInt();
           System.out.println("Digite o segundo número: ");
           n2 = tc.nextInt();
           System.out.println("Digite o terceiro número: ");
           n3 = tc.nextInt();
    }
       somaTresArgumentos(n1, n2, n3);
    
    };
    public static void somaTresArgumentos(int n1, int n2, int n3){
            int soma = n1 + n2 + n3;
            System.out.println("A soma dos três argumentos é de: " + soma);
        };   
}
