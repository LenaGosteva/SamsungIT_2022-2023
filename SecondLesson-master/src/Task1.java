import java.util.Scanner;
//Написать программу для расчёта N-го члена последовательности чисел Фибоначчи
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),  sum = 0;
        int f1 = 1, f2 = 1, fs = 0;
        for (int i = 2; i < n; i++) {
            fs = f1 + f2;
            f1 = f2;
            f2 = fs;
        }

        System.out.println(fs);

    }
}
