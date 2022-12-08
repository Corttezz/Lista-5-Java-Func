import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) throws Exception {
        String data, mes, dia, ano;

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma data no formato DD/MM/AAAA (Com as /): ");
        data = tc.nextLine();
        tc.close();

        dia = catchDia(data);
        mes = catchMês(data);
        ano = catchAno(data);
        print(dia, mes, ano);
    }

    public static String catchDia(String data) {
        try {
            String diaString = data.substring(0, 2);
            int diaInt = Integer.parseInt(diaString);
            if (diaInt > 31 || diaInt < 0) {
                return null;
            }
            return diaString;

        } catch (Exception e) {
            return null;
        }
    }

    public static String catchMês(String data) {
        try {
            int num;
            String mesPorExtenso;
            String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                    "Outubro", "Novembro", "Dezembro" };
            String numMes = data.substring(3, 5);
            num = Integer.parseInt(numMes) - 1;
            mesPorExtenso = meses[num];
            return mesPorExtenso;

        } catch (Exception e) {
            return null;
        }
    }

    public static String catchAno(String data) {
        try {
            String anoString = data.substring(6, 10);
            return anoString;

        } catch (Exception e) {
            return null;
        }
    }

    public static void print(String dia, String mes, String ano) {
        if (dia == null || mes == null || ano == null) {
            System.out.println("Data inválida.");
        } else {
            String dataFinal = dia + " de " + mes + " de " + ano + ".";
            System.out.println(dataFinal);
        }
    }
}
