import java.time.LocalTime;
import java.util.ArrayList;

public class CalculadoraMT {

    public static void main(String[] args) {

        long inicio = LocalTime.now().toNanoOfDay();
        ArrayList<Integer> quadrado = GeradorMT.gerarQuadrado();

        int x1 = GeradorMT.catchRandomNum(quadrado),
            x2 = GeradorMT.catchRandomNum(quadrado),
            x3 = GeradorMT.catchRandomNum(quadrado),
            x4 = GeradorMT.catchRandomNum(quadrado),
            x5 = GeradorMT.catchRandomNum(quadrado),
            x6 = GeradorMT.catchRandomNum(quadrado),
            x7 = GeradorMT.catchRandomNum(quadrado),
            x8 = GeradorMT.catchRandomNum(quadrado),
            x9 = GeradorMT.catchRandomNum(quadrado);

        int contador = 1;

        while(
            ((x1 + x2 + x3) != 15) || ((x4 + x5 + x6) != 15) || ((x7 + x8 + x9) != 15) ||
            ((x1 + x4 + x7) != 15) || ((x2 + x5 + x8) != 15) || ((x3 + x6 + x9) != 15) ||
            ((x1 + x5 + x9) != 15) || ((x3 + x5 + x7) != 15)
        ) {
            quadrado = GeradorMT.gerarQuadrado();
            contador++;
            x1 = GeradorMT.catchRandomNum(quadrado);
            x2 = GeradorMT.catchRandomNum(quadrado);
            x3 = GeradorMT.catchRandomNum(quadrado);
            x4 = GeradorMT.catchRandomNum(quadrado);
            x5 = GeradorMT.catchRandomNum(quadrado);
            x6 = GeradorMT.catchRandomNum(quadrado);
            x7 = GeradorMT.catchRandomNum(quadrado);
            x8 = GeradorMT.catchRandomNum(quadrado);
            x9 = GeradorMT.catchRandomNum(quadrado);
        }

        long fim = LocalTime.now().toNanoOfDay();

        System.out.println(x1 + " - " + x2 + " - " + x3);
        System.out.println(x4 + " - " + x5 + " - " + x6);
        System.out.println(x7 + " - " + x8 + " - " + x9);

        System.out.println("Quantidade de Tentativas: " + contador);
        System.out.println("Nanosegundos: " + (fim - inicio));     
        System.out.println("Segundos: " + ((fim - inicio) / 1000000000F));
    }
}