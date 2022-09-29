import java.util.Scanner;

public class Lista33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 0, q = 1;
        System.out.println("Informe o número de linhas: ");
        linhas = sc.nextInt();
        sc.close();
        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j <= 4; j++) {
                if (q % 4 != 0) {
                    System.out.print(q + " ");
                } else if (q % 4 == 0) {
                    System.out.print("PUM");
                }
                q++;
            }
        }
    }

}
