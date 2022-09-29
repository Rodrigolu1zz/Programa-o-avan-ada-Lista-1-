import java.util.Scanner;

public class Lista39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, r;
        System.out.println("Informe o valor da tabuada: ");
        x = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++){
            r = x * i;
            System.out.println(x + " X " + i + " = " + r);
        }

    }
}
