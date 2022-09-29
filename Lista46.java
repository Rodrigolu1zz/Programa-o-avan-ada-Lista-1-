import java.util.Scanner;

public class Lista46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m;

        System.out.println("Informe os valores de M e N");
        m = sc.nextLong();
        n = sc.nextLong();
        sc.close();

        System.out.println(fat_Recursivo(n) + fat_Recursivo(m));
    }
    public static long fat_Recursivo(Long n) {
		if(n==0) {			
			return 1;
		}else {			
			return n * fat_Recursivo(n-1);
		}
	}

}