import java.util.Scanner;

public class Lista17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nCasos, valor;
        System.out.println("Informe o numero de casos: ");
        nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            System.out.println("informe um valor inteiro (1 < x >= 107) ");
            valor = sc.nextInt();
            int result = Lista17.primo(valor);
            if (result == 1) {
                System.out.println(valor + " é primo");
            } else {
                System.out.println(valor + " Não é primo");
            }
        }

        sc.close();
    }

    static int primo(int n) {
        int aux;
        if (n <= 1)
            return 0;
        for (aux = 2; aux * aux <= n; aux++) {
            if (n % aux == 0)
                return 0;
        }
        return 1;
    }
}