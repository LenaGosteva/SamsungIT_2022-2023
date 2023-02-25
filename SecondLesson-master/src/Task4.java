import java.util.Scanner;
//Дано целое положительное число 𝑁. Определите минимальную отличную от нуля цифру в десятичном представлении числа 𝑁.
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), s = 0, min = 9;
        while (N != 0){
            s = N%10;
            if (s<min){
                min = s;
            }
            N /= 10;
        }
        System.out.println(min);

    }
}
