
// Разработайте метод sumOfSeven, который принимает в качестве аргументов два целых неотрицательных числа 𝑎,𝑏 и
// возвращает сумму цифр всех двузначных натуральных числах, кратных 7 на отрезке [𝑎;𝑏]
//Метод sumOfSeven должен:
//
//        быть членом класса NumberDigits(определен внутри этого класса);
//        иметь спецификатор доступа public;
//быть статическим.
public class NumberDigits
{
    public static int sumOfSeven(int a, int b){
        int result = 0;
        for (int i = a; i <= b; i++) {

            if (i >10 && i < 99 && i % 7 == 0) result+=Main.sumDigits(i);
        }
        return result;
    }

}
