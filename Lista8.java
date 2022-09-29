import java.util.Scanner;

public class Lista8 {
    public static void main(String[] args) {

        System.out.println("Calculo de imposto de renda");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a renda do homem: ");
        double renda_homem = sc.nextDouble();
        System.out.println("Informe a renda da mulher: ");
        double renda_mulher = sc.nextDouble();

        double renda_conjunta = renda_homem + renda_mulher;

        int aliquota = 0;
        double imposto_de_renda = 0 , renda_liquida = 0;

        if (renda_conjunta <= 900) {
            aliquota = 0;
            imposto_de_renda = (aliquota * renda_conjunta) / 100;
            renda_liquida = renda_conjunta - imposto_de_renda;
        } else if (renda_conjunta > 900 && renda_conjunta <= 1500) {
            aliquota = 10;
            imposto_de_renda = (aliquota * renda_conjunta) / 100;
            renda_liquida = renda_conjunta - imposto_de_renda;
        } else if (renda_conjunta > 1500 && renda_conjunta <= 2500) {
            aliquota = 15;
            imposto_de_renda = (aliquota * renda_conjunta) / 100;
            renda_liquida = renda_conjunta - imposto_de_renda;
        } else if (renda_conjunta > 2500) {
            aliquota = 25;
            imposto_de_renda = (aliquota * renda_conjunta) / 100;
            renda_liquida = renda_conjunta - imposto_de_renda;

        }
        System.out.println("Renda conjunta: " + renda_conjunta);
        System.out.println("Alíquota utilizada: " + aliquota);
        System.out.println("Imposto de renda: " + imposto_de_renda);
        System.out.println("Renda líquida: " + renda_liquida);

        sc.close();

    }

}
