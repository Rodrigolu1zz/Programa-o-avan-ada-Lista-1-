import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {

        //Questão 03
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        String Nome = sc.nextLine();

        System.out.println("Insira o seu salário: ");
        Double Sal_fixo = sc.nextDouble();

        System.out.println("Insira o total de vendas: ");
        Double Tot_vendas = sc.nextDouble();

        Double Comissao = 0.15, Sal_final;

        Sal_final = (Tot_vendas * Comissao) + Sal_fixo;

        System.out.println("%d vai receber %.2f:" + Nome);
        System.out.format("Total: %.2f", Sal_final);
        
        sc.close();

        
    }
    
}
