import java.util.Scanner;

//Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.
public class Ex008 {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = tc.nextInt();

        quantidadeDigitos(num);

        tc.close();
    }

    public static void quantidadeDigitos (int num){
        int tamanho;
        tamanho = Integer.toString(num).length();
        System.out.println("O número "+ num + " tem "+tamanho+" dígitos.");   
    } 
}
