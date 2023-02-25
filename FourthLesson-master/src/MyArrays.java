import java.util.Scanner;

//Разработайте метод avgOf4Digit, который который принимает в качестве аргумента массив целых чисел и
// возвращает вещественное число типа double - среднее арифметическое элементов массива, которые являются четырехзначными натуральными числами.
// Элементы массива по абсолютной величине не превосходят 10^9. Количество элементов массива не превосходит 10^4
//
//        Если в массиве нет таких чисел, метод должен вернуть число -1.
//
//        Метод avgOf4Digit должен:
//        быть членом класса MyArrays;
//        иметь спецификатор доступа public;
//быть статическим.
public class MyArrays {
    public static double avgOf4Digit(int... args) {
        int k = 0, sum = 0;
        boolean f = true;
        for (int i : args) {
            if (i >= 1000 && i <= 9999) {
                sum += i;
                k++;
                f = false;
            }

        }
        if (f) return -1;
        else return sum / k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) array[i] = in.nextInt();
        System.out.println(MyArrays.minToBegin(array));
    }
//    Разработайте метод minToBegin, который принимает в качестве аргумента массив целых чисел,
//    находит наименьший элемент массива и переставляет его в начало массива (под индексом 0).
//    Остальные элементы сдвигаются, соответственно, вправо, на одну позицию.
//    Если в массиве несколько одинаковых наименьших элементов, переставлять нужно тот из них, который имеет наименьший номер.
//    Элементы массива по абсолютной величине не превосходят 10^9. Количество элементов массива не превосходит 10^4.
//    Метод minToBegin должен:
//
//    быть членом класса MyArrays;
//    иметь спецификатор доступа public;
//    быть статическим.
    public static int[] minToBegin(int arr[]){
        int min = 1_000_000_000, j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                j = i;
            }
            for (int k = j; k > 1; k--) {
                arr[k] = arr[k - 1];
            }
            arr[0] = min;
        }
        return arr;
    }

}
