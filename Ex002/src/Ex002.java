import java.util.Scanner;

// Faça um programa para imprimir:
//     1
//     1   2
//     1   2   3
//     .....
//     1   2   3   ...  n
// para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.
public class Ex002 {
    public static void main(String[] args) throws Exception {
        int n;
        System.out.println("Digite a quantidade de linhas:");
        try (Scanner tc = new Scanner(System.in)) {
            n = tc.nextInt();
        }
        geraMatriz(n);
    }
    public static void geraMatriz(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
