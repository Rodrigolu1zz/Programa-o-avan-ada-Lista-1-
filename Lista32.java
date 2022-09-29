import java.util.Scanner;

public class Lista32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alc_Q = 0, gas_Q = 0, dis_Q = 0;
        double alc_L = 0, gas_L = 0, dis_L = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Informe o combustível utilizado (1. Álcool; 2.Gasolina; 3.Disel): ");
            int tipo = sc.nextInt();
            System.out.println("Informe a quantidade do abastecimento em litros: ");
            double quantidade = sc.nextDouble();
            if (tipo == 1){
                alc_Q++;
                alc_L += quantidade;
            }
            else if (tipo == 2){
                gas_Q++;
                gas_L += quantidade;
            }
            else if (tipo == 3){
                dis_Q++;
                dis_L += quantidade;
            }
        }
        System.out.println("Álcool: " + alc_Q + " Qtd litros: " + alc_L);
        System.out.println("Gasolina: " + gas_Q + " Qtd litros: " + gas_L);
        System.out.println("Disel: " + dis_Q + " Qtd litros: " + dis_L);
        sc.close();

    }
}
