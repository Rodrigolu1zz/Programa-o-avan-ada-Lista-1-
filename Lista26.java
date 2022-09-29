import java.util.Scanner;

public class Lista26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, aux = 0;
        double altura;

        System.out.println("Informe a sua altura e idade para verificar em quantos brinquedos poderá ir: ");
        altura = sc.nextDouble();
        idade = sc.nextInt();
        sc.close();

        if (altura >= 1.5 && idade >= 12){
            aux++;
        }
        if (altura >= 1.4 && idade >= 14){
            aux++;
        }
        if (altura >= 1.7 || idade >= 16){
            aux++;
        }

        System.out.println("Você poderá ir em " + aux + " brinquedos");

    }
}
