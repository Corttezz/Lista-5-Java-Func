import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) throws Exception {
        int horas, minutos, horasConvertidas;
        String resp = "";

        Scanner tc = new Scanner(System.in);

        while(resp != "n"){
            System.out.println("Digite as horas (Formato 24):");
            horas = tc.nextInt();
            System.out.println("Digite os minutos: ");
            minutos = tc.nextInt();
            
            horasConvertidas = converter(horas);
            saida(horas, horasConvertidas, minutos);
            System.out.println("Deseja continuar: [S/n]");
            resp = tc.next().toLowerCase();
        }

        tc.close();
    }

    private static int converter(int horas){
        if (horas > 12){
            horas = horas - 12;
            return horas;
        }else{
            return horas;
        }
    }

    private static void saida(int horas, int horasConvertidas, int minutos){
        String P = "P.M";
        String A = "A.M";
         if(horas < 12){
            System.out.println("As horas foram convertidas em: "+horasConvertidas+":"+minutos+" "+A);
         }else{
            System.out.println("As horas foram convertidas em: "+horasConvertidas+":"+minutos+" "+P);
         }
    } 
}