
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) throws Exception {
        int linhas, colunas;
        Scanner tc = new Scanner(System.in);
        System.out.println("Quantas linhas?");
        linhas = tc.nextInt();
        System.out.println("Quantas colunas?");
        colunas = tc.nextInt();
        if (linhas < 1) {
            System.out.println(" Valor inválido, quantidade de linhas alterada para 1.");
            linhas = 1;
            desenhaMoldura(linhas, colunas);
        }else if(linhas > 20){
            System.out.println(" Valor inválido, quantidade de linhas alterada para 20.");
            linhas = 20;
            desenhaMoldura(linhas, colunas);
        }else if(colunas > 20){
            System.out.println(" Valor inválido, quantidade de colunas alterada para 20.");
            colunas = 20;
            desenhaMoldura(linhas, colunas);
        } else if(colunas < 1){
            System.out.println(" Valor inválido, quantidade de colunas alterada para 1.");
            colunas = 1;
            desenhaMoldura(linhas, colunas);
        }
        else {
            desenhaMoldura(linhas, colunas);
        }

        tc.close();
    }

    public static void desenhaMoldura(int linhas, int colunas) {

        for (int i = 1; i <= linhas; i++) {
            System.out.print(" _");
        }
        System.out.println("");
        for (int j = 1; j <= colunas; j++) {
            System.out.print("|");
            for (int i = 1; i <= linhas - 1; i++) {
                System.out.print("+ ");

            }
            System.out.println("|");

        }
        for (int i = 1; i <= linhas; i++) {
            System.out.print(" -");
        }
    }
}
