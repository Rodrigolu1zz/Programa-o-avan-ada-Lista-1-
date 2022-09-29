import java.util.Scanner;

public class Lista6 {
    public static void main(String[] args) {
        
        //Questão 06

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de média de combustível");
        System.out.println("Informe a distância total percorrida em km: ");
        int foot = sc.nextInt();
        System.out.println("Informe o total de combustível gasto em litros: ");
        Double gas= sc.nextDouble();

        Double media = media(foot, gas);

        System.out.printf("A média de comsumo é: %.3f", media);

        sc.close();

    }
    public static Double media(int foot, Double gas){
        Double aux = foot/gas;
        return aux;

    }

    
    
}
