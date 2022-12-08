import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) throws Exception {
        int arg;
        String imprime;
        try (Scanner tc = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            arg = tc.nextInt();
        }
        imprime = funcArg(arg);
        System.out.println(imprime);
    }
    private static String funcArg(int arg){
        String retorno;
        if(arg > 0){
            retorno = "P";
            return retorno;
        }else{
            retorno = "N";
            return retorno;
        }
    }
}
