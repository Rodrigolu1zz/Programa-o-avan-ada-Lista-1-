import java.util.Scanner;

public class Lista15 {

    public static void main(String[] args) {

        // Questão 15

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int x = sc.nextInt();
        if (x < 46) {
            int a = 1;
            int b = 0;
            int aux;
            for (int i = 0; i < x; i++) {
                System.out.print(a + " ");
                aux = a;
                a = a + b;
                b = aux;
            }
        } else {
            System.out.println("numero inválido, informe um número menor que 46!");
        }
        sc.close();
    }

}
