import java.util.Scanner;
public class Lista40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe o primeiro lado do triangulo: ");
        a = sc.nextInt();
        System.out.println("Informe o segundo lado do triangulo: ");
        b = sc.nextInt();
        System.out.println("Informe o terceiro lado do triangulo: ");
        c = sc.nextInt();

        sc.close();

        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("Valores não formam um triângulo");
        } 
        else if ((a!=b)&&(a==c)||(a==b)&&(a!=c)||(b!=a)&&(b==c)){
            System.out.println("Isóceles");
        } 
        else if (a == b && b == c) {
            System.out.println("Equilátero");
        } 
        else if (a != b && b != c && a != c) {
            System.out.println("Escaleno");
        }
    }
}
