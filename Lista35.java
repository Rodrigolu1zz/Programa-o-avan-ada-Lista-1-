public class Lista35 {
    public static void main(String[] args) {
        double a, b = 1, c, S = 0;
        for (a = 1; a <= 39; a += 2) {
            c = a / b;
            S += c;
            b *= 2;
        }
        System.out.println(S);

    }
}
