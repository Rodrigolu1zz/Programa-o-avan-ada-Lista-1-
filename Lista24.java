import java.util.Scanner;

public class Lista24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroInvertido = 0, numero, aux;

        do {
            System.out.println("Digite um número de até 5 dígitos para verificar se ele é palíndromo: ");
            numero = sc.nextInt();
            sc.close();
            aux = numero;
            while (aux > 0) {
                numeroInvertido *= 10;
                numeroInvertido += (aux % 10);
                aux /= 10;
            }
        } while (numero > 99999);

        if (numero == numeroInvertido) {
            System.out.println("S");
        } else
            System.out.println("N");

    }
}