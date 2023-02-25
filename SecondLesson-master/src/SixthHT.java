import java.util.Scanner;

public class SixthHT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat(), y = in.nextFloat();
        boolean P = y <= 2 - x*x, a = y >= x, s = y > 0 && P;

        System.out.println(P && a || s ? "YES": "NO");

    }
}
