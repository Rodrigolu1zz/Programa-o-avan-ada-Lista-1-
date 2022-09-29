import java.util.Scanner;

public class LIsta34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Informe o número de colunas : ");
        int x = sc.nextInt();
        System.out.println("Informe a quantidade número: ");
        int y = sc.nextInt();

        sc.close();

        while (i < y) {
            System.out.println();
            for (int j = 0; j < x; j++) {
                System.out.print(i + " ");
                i++;
            }
        }

    }
}
