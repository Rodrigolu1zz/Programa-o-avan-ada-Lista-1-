import java.util.Scanner;

public class Lista41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, peso, peso_ideal;
        System.out.println("Informe a sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Informe o seu peso: ");
        peso = sc.nextDouble();
        sc.close();

        if (altura <= 1.50) {
            peso_ideal = 50;
            if (peso > peso_ideal) {
                System.out.println("Emagreça " + (peso - peso_ideal) + " kg");
            }
            else if (peso < peso_ideal){
                System.out.println("Engorde " + (peso_ideal-peso) + " kg");
            } 
            else {
                System.out.println("Parabéns, você está no peso ideal");
            }
        } 
        else if (altura <= 1.90) {
            peso_ideal = 70;
            if (peso > peso_ideal) {
                System.out.println("Emagreça " + (peso - peso_ideal) + " kg");
            }
            else if (peso < peso_ideal){
                System.out.println("Engorde " + (peso_ideal-peso) + " kg");
            } 
            else {
                System.out.println("Parabéns, você está no peso ideal");
            }
        }
        else if (altura > 1.90) {
            peso_ideal = 100;
            if (peso > peso_ideal) {
                System.out.println("Emagreça " + (peso - peso_ideal) + " kg");
            }
            else if (peso < peso_ideal){
                System.out.println("Engorde " + (peso_ideal-peso) + " kg");
            } 
            else {
                System.out.println("Parabéns, você está no peso ideal");
            }
        }
    }
}