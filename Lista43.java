import java.util.Scanner;

public class Lista43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cont = 0, troco = 0;
        System.out.println("informe o valor da compra: ");
        int n = sc.nextInt();
        System.out.println("informe o valor pago: ");
        int m = sc.nextInt();
        sc.close();

        if (n > m) {
            System.out.println("Faltam " + (n - m) + " Reais para efetuar o pagamento!");
        } else {
            troco = m - n;
        }

        while (troco >= 100) {
            cont++;
            troco -= 100;
        }
        while (troco >= 50) {
            cont++;
            troco -= 50;
        }
        while (troco >= 20) {
            cont++;
            troco -= 20;
        }
        while (troco >= 10) {
            cont++;
            troco -= 10;
        }
        while (troco >= 5) {
            cont++;
            troco -= 5;
        }
        while (troco >= 2) {
            cont++;
            troco -= 2;
        }

        if((cont>2)){
            System.out.println("Impossível");
        }else{
            System.out.println("Possível");
        }

    }
}
