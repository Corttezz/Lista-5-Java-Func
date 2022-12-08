import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) throws Exception {
      String palavra, embaralhado;
      Scanner tc = new Scanner(System.in);
      System.out.println("Digite uma palavra: ");
      palavra = tc.nextLine();
      embaralhado = embaralharPalavra(palavra);
      System.out.println("A palavra embaralhada fica: " + embaralhado);

      tc.close();
      
    }

    public static String embaralharPalavra(String palavra) {
      List<String> letters = Arrays.asList(palavra.split(""));
      Collections.shuffle(letters);
      StringBuilder t = new StringBuilder(palavra.length());
      for (String k : letters) {
          t.append(k);
      }
      return t.toString().toUpperCase();
  }
}
