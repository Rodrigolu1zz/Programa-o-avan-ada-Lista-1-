import java.util.Scanner;

public class Lista1{

    public static void main(String[] args) {
        
        //Questão 01
        
        Scanner sc = new Scanner(System.in);
        Double Peso_A = 3.5, Peso_B = 7.5;
        System.out.println("Insira a primeira nota: ");
        Double A = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        Double B = sc.nextDouble();

        Double Media = ((A * Peso_A) + (B * Peso_B))/(Peso_A + Peso_B);

        System.out.format("A média do aluno é: " + "%.2f ", Media );

        sc.close();
        

    }

}