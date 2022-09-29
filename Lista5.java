import java.util.Arrays;
import java.util.Scanner;

public class Lista5 {
    public static void main(String[] args) {

        //Questão 05
        
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[4];
        
        System.out.println("Digite três números para ordena-los");

        for (int i = 1; i < lista.length; i++){
            System.out.println("Digite o " + i + "º número : ");
            lista[i] = sc.nextInt();
        }
        Arrays.sort(lista);

        System.out.print("Números ordenados ");

        for (int j = 1; j < lista.length; j++){
            System.out.print(lista[j] + " ");
        }

        sc.close();

    }
    
}
