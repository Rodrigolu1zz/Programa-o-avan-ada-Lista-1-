import java.util.Scanner;

public class Lista36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i = 0;

        System.out.println("informe um número: ");
        n = sc.nextInt();
        sc.close();

        while (n-1 > i){
            System.out.print("HO ");
            i++;
        }
        System.out.print("HO!");
    }
}