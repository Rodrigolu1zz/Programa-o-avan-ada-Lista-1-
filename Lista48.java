import java.util.Scanner;

public class Lista48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        float peso;
        System.out.println("informe a idade do paciente");
        idade = sc.nextInt();
        System.out.println("informe o peso do paciente");
        peso = sc.nextFloat();
        sc.close();

        if (idade >= 12){
            if (peso >= 60){
                System.out.println("40 gotas");
            }
            else if (peso < 60){
                System.out.println("35 gotas");
            }
        }
        else if (idade < 12){
            if ((peso >= 5) && (peso <= 9)){
                System.out.println("5 gotas");
            } 
            else if ((peso > 9) && (peso <= 16)){
                System.out.println("10 gotas");
            }
            else if ((peso > 16) && (peso <= 24)){
                System.out.println("15 gotas");
            }
            else if ((peso > 24) && (peso <= 30)){
                System.out.println("20 gotas");
            }else if (peso > 30){
                System.out.println("30 gotas");
            }
        }
    }   
}

