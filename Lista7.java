import java.util.Scanner;

public class Lista7{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        int valor = sc.nextInt();
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        nota100 = (valor/100);
        valor %= 100;
        nota50 = (valor/50);
        valor %= 50;
        nota20 = (valor/20);
        valor %= 20;
        nota10 = (valor/10);
        valor %= 10;
        nota5 = (valor/5);
        valor %= 5;
        nota2 = (valor/2);
        valor %= 2;
        nota1 = valor;
        
        sc.close();
        
        System.out.println(nota100 + " nota(s) de R$ 100");
        System.out.println(nota50  + " nota(s) de R$ 50");
        System.out.println(nota20  + " nota(s) de R$ 20");
        System.out.println(nota10  + " nota(s) de R$ 10");
        System.out.println(nota5   + " nota(s) de R$ 5");
        System.out.println(nota2   + " nota(s) de R$ 2");
        System.out.println(nota1   + " nota(s) de R$ 1");

        


    }
}