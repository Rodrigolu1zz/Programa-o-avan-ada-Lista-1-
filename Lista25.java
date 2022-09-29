import java.util.Scanner;

public class Lista25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("O trabalho tem interface gráfica? (0 - Não; 1 - Sim)");
        int iGrafica = sc.nextInt();
        System.out.println("O trabalho tem Inteligência artificial? (0 - Não; 1 - Sim)");
        int iA = sc.nextInt();
        System.out.println("O trabalho tem Encapsulamento? (0 - Não; 1 - Sim)");
        int encapsulamento = sc.nextInt();
        System.out.println("O trabalho tem identação (0 - Não; 1 - Sim)");
        int identação = sc.nextInt();
        System.out.println("O trabalho tem strucks? (0 - Não; 1 - Sim)");
        int structs = sc.nextInt();
        sc.close();

        int i = 0;

        if (iGrafica == 1 || iA == 1){
            i++;
        }
        if (encapsulamento == 1 && identação == 1){
            i++;
        }
        if (structs == 1){
            i++;
        }
        if (i == 3){
            System.out.println("Avaliado");
        }
        else System.out.println("Aluno reprovado");

    }
    
}
