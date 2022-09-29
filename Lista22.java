import java.util.Scanner;

public class Lista22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int conta = 0, consumo = 0;

        do {
            System.out.println("Informe o valor do consumo em metros cúbicos que esteja entre 0 e 1000: ");
            consumo = sc.nextInt();

            if (consumo <= 10) {
                conta = 7;
                
            } else if (consumo <= 30) { // Para o consumo 11 a 30
                conta = (consumo - 10) * 1 + 7;

            } else if (consumo <= 100) { // Para o consumo 31 a 100
                conta = (consumo - 31) * 2 + 27;

            } else if (consumo > 100) { // Para o consumo acima de 100
                conta = (consumo - 100) * 5 + 167;
            }
        } while (consumo > 1000);

        System.out.println("Valor da conta: " + conta);

        sc.close();
    }
}