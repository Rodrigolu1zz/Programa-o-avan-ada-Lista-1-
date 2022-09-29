import java.util.Scanner;

public class Lista21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vel = new double[3];
        int[] ano = new int[3];
        int mais_novo = 0;
        double mais_rapido = 0;

        for (int i = 0; i < ano.length; i++) {
            System.out.println("Digite o ano do " + (i+1) + "° carro: ");
            ano[i] = sc.nextInt();
        }
        for (int j = 0; j < vel.length; j++) {
            System.out.println("Digite a velocidade do " + (j+1) + "° carro: ");
            vel[j] = sc.nextDouble();
        }
        sc.close();
        for(int i = 0; i < ano.length; i++){
            if (ano[i] > mais_novo){
                mais_novo = ano[i];
            }
        }
        for(int j = 0; j < vel.length; j++){
            if (vel[j] > mais_rapido){
                mais_rapido = vel[j];
            }
        }

        System.out.printf("Ano do carro mais novo: %d \nE a velocidade do carro mais rápido é: %.1f", mais_novo, mais_rapido);
        
    }

}
