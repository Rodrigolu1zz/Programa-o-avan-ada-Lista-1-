import java.util.Scanner;
public class Lista10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de dias: ");
        int dias_total = sc.nextInt();

        int AA, MM, DD;

        AA = dias_total/365;
        dias_total %= 365;
        MM = dias_total/30;
        dias_total %= 30;
        DD = dias_total;

        System.out.println(AA + " ano (s)");
        System.out.println(MM + " mês (es)");
        System.out.println(DD + " dia (s)");

        sc.close();


    }
    
}
