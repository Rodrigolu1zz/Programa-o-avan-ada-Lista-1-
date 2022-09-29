import java.util.Scanner;

public class Lista19 {

    public static void main(String[] args) {

        // Questão 19
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário para saber o seu respectivo aumento: ");
        double sal = sc.nextDouble();

        sc.close();

        if (sal < 300) {
            sal += sal * 0.05;
            System.out.printf("Novo salário: %.2f", sal);
        } else if (sal >= 300 && sal < 500) {
            sal += sal * 0.07;
            System.out.printf("Novo salário: %.2f", sal);
        } else if (sal >= 500) {
            sal += sal * 0.10;
            System.out.printf("Novo salário: %.2f", sal);
        }

    }
}
