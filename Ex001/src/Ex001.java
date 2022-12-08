
// Faça um programa para imprimir:
//     1
//     2   2
//     3   3   3
//     .....
//     n   n   n   n   n   n  ... n
// para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) throws Exception {
        int n;
        System.out.print("Entre com o número de linhas: ");
        Scanner tc = new Scanner(System.in);
        n = tc.nextInt();
        System.out.println("Sua matriz ficará assim: ");
        imprimirLinhas(n);
        tc.close();
    }

    public static void imprimirLinhas(int n) {
       for(int i = 1; i <= n; i++){
        for(int j = 1; j<= i; j++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
       }
    }
}