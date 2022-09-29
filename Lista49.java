import java.util.Scanner;

public class Lista49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float altura, peso, imc;
        
        System.out.println("Informe a sua altura: ");
        altura = sc.nextFloat();
        System.out.println("Informe o seu peso: ");
        peso = sc.nextFloat();
        sc.close();

        imc = peso/(altura*altura);

        if (imc < 20){
            System.out.println("IMC: " + imc + " - Abaixo do peso");
        }
        else if (imc >= 20 && imc < 25){
            System.out.println("IMC: " + imc + " - Peso normal");
        }
        else if (imc >= 25 && imc < 30){
            System.out.println("IMC: " + imc + " - Sobrepeso");
        }
        else if (imc >= 30 && imc < 40){
            System.out.println("IMC: " + imc + " - Obeso");
        }
        else if (imc >= 40){
            System.out.println("IMC: " + imc + " - Obeso mórbido");
        }

    }
}
