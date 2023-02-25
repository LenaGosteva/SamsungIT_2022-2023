public class MyStack <T>{

    private Node head;
    private int size;
    public boolean isEmpty(){
        return size==0;
    }
    public void push(T data){
        Node newNode = new Node(data);

        if (!isEmpty()) newNode.next = head;
        head = newNode;
        ++size;
    }

    public T peek(){
        if(isEmpty())return null;
        return head.data;
    }

    public T pop() {
        if ((isEmpty())) return null;
        T returnData = head.data;
        head = head.next;
        --size;            return returnData;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node cursor = head;
        while (cursor!=null){
            builder.append(cursor.data.toString()).append(" -> ");
            cursor = cursor.next;
        }
        builder.append(" null... \nsize: ").append(size);
        return builder.toString();
    }
    private class Node{
        T data;
        Node next = null;

        public Node(T data) {
            super();
            this.data = data;
        }


    }
}
