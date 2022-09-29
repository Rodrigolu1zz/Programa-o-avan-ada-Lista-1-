import java.util.Scanner;

public class Lista38 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele é primo: ");
        int x = sc.nextInt();

        sc.close();
        
        int aux = 0;

        for (int i = 1; i<=x; i++){
            if (x % i == 0) aux++;
        }

        if (aux == 2) System.out.println(x + " é primo!");
        else System.out.println(x + " não é primo!");
    }
}