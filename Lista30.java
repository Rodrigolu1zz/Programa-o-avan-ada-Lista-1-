import java.util.Scanner;

public class Lista30 {
    int m = 0, n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista30[] vet = new Lista30[3];

        System.out.println("Informe tres pares de valores.");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = new Lista30();
            vet[i].m = sc.nextInt();
            vet[i].n = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < vet.length; i++) {
            System.out.println(" ");
            if (vet[i].m < vet[i].n) {
                for (int j = vet[i].m; j <= vet[i].n; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = vet[i].n; j <= vet[i].m; j++) {
                    System.out.print(j);
                }
            }
            System.out.print(" Soma = " + metodo(vet[i].m, vet[i].n));
        }

    }
    public static int metodo(int m, int n){
        int soma=0, j=0;
        if(m<n){
            for(j =m; j<=n;j++){
                soma += j;
            }
        }else{
            for(j =n; j<=m;j++){
                soma += j;
            }
        }      
        return soma;
    }

}