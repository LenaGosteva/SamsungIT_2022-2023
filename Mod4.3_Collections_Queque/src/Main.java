import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new LinkedList<String>();
//        list.add("list element number 1");
//        list.add("list element number 2");
//        list.add("list element number 3");
//        list.add("list element number 4");
//        list.add("list element number 5");
//        list.add("list element number 6");
//        for (String str:list) {
//            System.out.println(str);
//        }
//        list.forEach(System.out::println);

        MyStack<String> stack = new MyStack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
        stack.peek();
        System.out.println(stack);
    }
}