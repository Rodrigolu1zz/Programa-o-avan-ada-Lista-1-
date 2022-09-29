import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args) {

        //Questão 04
        
        int A, B, C, Maior = 0, Menor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        A = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        B = sc.nextInt();
        System.out.println("Insira o terceiro número: ");
        C = sc.nextInt();

        Maior = max(A, B, C);
        Menor = min(A, B, C);
      

        System.out.println("Maior: " + Maior);
        System.out.println("Menor: " + Menor);

        sc.close();
    }

    public static int max (int X, int Y, int Z){
        int aux;
        if (X > Y && X > Z){
            aux = X;
        }
        else if (Y > Z){
            aux = Y;
        }
        else {
            aux = Z;
        }
        return aux;
    }

    public static int min (int X, int Y, int Z){
        int aux;
        if (X < Y && X < Z){
            aux = X;
        }
        else if (Y < Z){
            aux = Y;
        }
        else {
            aux = Z;
        }
        return aux;
    }

    
}
