import java.util.Random;
import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) throws Exception {
        int result;
        String resp = "";
        Scanner tc = new Scanner(System.in);
        System.out.println("Primeira rodada: Deseja jogar os dados?[S/N]");
        resp = tc.nextLine();

        if ("s".equalsIgnoreCase(resp)) {
            result = jogarDados();
            printarDados(result);
            natural(result);
            craps(result);
            ponto(result);

        } else {
            System.out.println("Obrigado por participar do jogo.");
        }
        tc.close();

    }

    public static int jogarDados() {
        int numDado;
        Random aleatorio = new Random();
        numDado = aleatorio.nextInt(10) + 2;
        return numDado;

    }

    public static void printarDados(int result) {
        System.out.println("---------------------------");
        System.out.println("Jogando dados...");
        System.out.println("---------------------------");
        System.out.println("O número é " + result);
    }

    public static void natural(int result) {
        if (result == 7 || result == 11) {
            System.out.println("---------------------------");
            System.out.println("Parábens você é um natural e ganhou!");
            System.out.println("---------------------------");
        }
    }

    public static void craps(int result) {
        if (result == 2 || result == 3 || result == 12) {
            System.out.println("-------------------------------");
            System.out.println("Craps! Você perdeu.");
            System.out.println("---------------------------");
        }
    }

    public static int ponto(int result) {
        String resp = "";
        int ponto = result;
        int i = 2;
        if (result == 4 || result == 5 || result == 6 || result == 8 || result == 9 || result == 10) {
            System.out.println("---------------------------");
            System.out.println("Você tirou o número " + result + ", jogue os dados e tire-o novamente para ganhar!");
            Scanner tc = new Scanner(System.in);
            System.out.println("---------------------------");
            System.out.println("Deseja jogar os dados novamente? [S/N]");
            resp = tc.nextLine().toLowerCase();
            while (resp != "n") {
                if("n".equals(resp)){
                    System.out.println("Obrigado por participar do jogo.");
                    break;
                }
                System.out.println(i + "ª rodada começando...");
                i++;

                result = jogarDados();
                printarDados(result);
                if (result == ponto) {
                    System.out.println("---------------------------");
                    System.out.println("Você tirou " + ponto + " novamente! Você ganhou!");
                    System.out.println("---------------------------");
                    break;
                } else if (result == 7) {
                    System.out.println("---------------------------");
                    System.out.println("Você tirou o número 7, portanto você perdeu.");
                    System.out.println("---------------------------");
                    break;
                } else {
                    System.out.println("---------------------------");
                    System.out.println(
                            "Você tirou o número " + result + ", nada aconteceu. Terá que jogar os dados novamente.");
                    System.out.println("---------------------------");
                    System.out.println("Deseja jogar os dados novamente? [S/N]");
                    resp = tc.nextLine().toLowerCase();
                    
                }
            }
            
            tc.close();

        }
        return result;
    }
}
