import java.util.Scanner;

public class Lista16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0;
        System.out.println("Informe a população de A");
        a=sc.nextDouble();
        System.out.println("Informe a populacão de B");
        b=sc.nextDouble();
        sc.close();
        int tempo =1;

        while(a < b){
            a += (0.03*a);
            b += (0.015*b);
            tempo++;
        }
       
        System.out.println(tempo+" anos");
    }
}