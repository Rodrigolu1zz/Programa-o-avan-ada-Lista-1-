import java.util.Scanner;

public class Lista31 {
    public static void main(String[] args) {
        double n1 = -1, n2 = -1, media;
        Scanner sc = new Scanner(System.in);

        while (n1 < 0 || n1 > 10) {
            System.out.println("Insira a nota 1: ");
            n1 = sc.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.println("NOTA INVÁLIDA");
            }
        }
        while (n2 < 0 || n2 > 10) {
            System.out.println("Insira a nota 2: ");
            n2 = sc.nextDouble();
            if (n2 < 0 || n2 > 10) {
                System.out.println("NOTA INVÁLIDA");
            }
        }
        sc.close();
        media = (n1 + n2) / 2;
        System.out.print("Média: " + media);
    }
}
