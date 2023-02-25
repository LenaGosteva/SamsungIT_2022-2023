public class Main {
    public static void main(String[] args) {

        MyLinkedList<Object> linkedList = new MyLinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2, 3, 4);
        linkedList.add(5, 6, 7, 8);
        System.out.println(linkedList);
        System.out.println("-----");
        System.out.println(linkedList.toListString());


    }
}