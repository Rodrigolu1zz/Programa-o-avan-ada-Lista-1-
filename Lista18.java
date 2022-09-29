import java.util.Scanner;

public class Lista18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número com no máximo 4 dígitos: ");
        int num = sc.nextInt();
        int i = 0;
        sc.close();

        if (num < 9999) {
            while (num > 0) {
                i *= 10;
                i += (num % 10);
                num /= 10;
            }
            System.out.println("Numero invertido: " + i);
        } else
            System.out.println("Erro: Dígite um número com até 4 dígitos! ");
    }
}
