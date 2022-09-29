import java.util.Scanner;

public class Lista42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, aumento, aux;

        System.out.println("informe o preço antigo do cinema: ");
        a = sc.nextInt();
        System.out.println("informe o novo preço do cinema: ");
        b = sc.nextInt();
        sc.close();
        aux = (b*100)/a;
        aumento = aux-100;
        if (aumento == 0){
            System.out.println("O preço do cinema não subiu!");
        } else System.out.println("QUE ABSURDO! O PREÇO DO CINEMA SUBIU "+aumento+"% !!!");

    }
}
