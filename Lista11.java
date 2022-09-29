import java.util.Scanner;

public class Lista11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora inicial do jogo: ");
        int hr1 = sc.nextInt();
        System.out.println("Informe a hora final do jogo: ");
        int hr2 = sc.nextInt();
        int tempo = hr2 - hr1;
        if (tempo < 0){
            int dia = tempo + 24;
            System.out.println("O jogo teve " +dia+ " horas de duração");
        }
        else if (tempo == 0){
            System.out.println("O jogo durou 24 horas");
        }
        else{
            System.out.println("O jogo teve " +tempo+ " horas de duração");
        }

        sc.close();
    }
}