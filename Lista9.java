import java.util.Scanner;
public class Lista9 {
    public static void main(String[] args) {

        //Questão 09
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tempo em segundos: ");
        int segundo_total = sc.nextInt();

        int HH, MM, SS;

        HH = segundo_total / 3600;
        segundo_total %= 3600;
        MM = segundo_total / 60;
        segundo_total %= 60;
        SS = segundo_total;

        System.out.format("HH:MM:SS "+ HH +":"+ MM +":"+ SS);

        sc.close();

    }
    
}
