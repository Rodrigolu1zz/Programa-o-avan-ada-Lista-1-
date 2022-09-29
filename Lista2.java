import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {

        //Quetão 02

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a sua matricula: ");
        int Matricula = sc.nextInt();
        System.out.println("");

        System.out.println("Informe o nº de horas trabalhadas:");
        int Horas = sc.nextInt();

        System.out.println("Informe o valor da hora de trabalho: ");
        Double vl_Hora = sc.nextDouble();

        Double Salario = Horas * vl_Hora;

        System.out.println("Matrícula: " + Matricula);
        System.out.format("Salário: %.2f" , Salario);

        sc.close();


    }
}
