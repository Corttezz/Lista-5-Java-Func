import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = tc.nextInt();
        reverso(num);
        tc.close();
    }
    public static void reverso(int num){
        String invertido, numString;

        numString = Integer.toString(num);
        invertido = new StringBuilder(numString).reverse().toString();     
        System.out.println("O número " +num+ " invertido fica: "+invertido);
    }
}
