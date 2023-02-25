import javax.sound.midi.Soundbank;
import java.util.Scanner;
// вывести сколько лет
public class LessonFirthEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 100) {
            System.out.println("Вы уже ОЧЕНЬ старый ;( Тутанхомона не застали?");
            return;
        }
        int nums = n % 100;
        String result = String.valueOf(n);
        switch (nums) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                result += " лет";
                break;
            default:
                switch (nums % 10) {
                    case 0:
                    case 6:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        result += " лет";
                        break;
                    case 1:
                        result += " год";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        result += " года";
                        break;
                    default:
                        result = "Кажется, Вы еще не родились :( Как жаль";
                }
        }
        System.out.println(result);
    }
}
