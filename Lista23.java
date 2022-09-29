import java.util.Scanner;

public class Lista23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Informe dois números para x e y respectivamente: ");
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();

        Maior(x, y);
		Igual(x, y);
		Menor(x, y);	
		Diferente(x, y);
		Maior_igual(x, y);
		Menor_igual(x, y);
	}

	public static void Maior(int x, int y) {

		if (x > y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Menor(int x, int y) {

		if (x < y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Igual(int x, int y) {

		if (x == y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Maior_igual(int x, int y) {

		if (x >= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	public static void Menor_igual(int x, int y) {

		if (x <= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
	
    public static void Diferente(int x, int y) {

		if (x != y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}