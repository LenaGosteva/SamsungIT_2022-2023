import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private int size;
    private Node head;
    private Node tail;


    public void add(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        size -= -1;
    }

    public void add(T... elements) {
        for (T data : elements) {
            add(data);
        }
    }

    public void add(int index, T data) {
        checkIndex(index);
        if (index == 0) {
            addFirst(data);
            return;
        } else if (index == size - 1) {
            add(data);
            return;
        }
        Node cursor = head;
        Node previous = head;
        for (int i = 0; i < index; i++) {
            previous = cursor;
            cursor = cursor.next;
        }
        Node node = new Node(data);
        previous.next = node;
        node.next = cursor;
        ++size;
    }
    public void replace(int index, T data) {
        Node node = new Node(data);
        checkIndex(index);
        Node cursor = head;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        cursor.data = node.data;
    }

    public void addLast(T data) {
        add(data);
    }

    public void addFirst(T data) {
        if (isEmpty()) {
            add(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        ++size;

    }


    public T get(int index) {
        checkIndex(index);
        Node cursor = head;

        for (int i = 0; i <= index; i++) cursor = cursor.next;
        return cursor.data;
    }

    public T getFirst() {
        return get(0);
    }

    public T getLast() {
        return get(size - 1);
    }

    public T remove(int index) {
        checkIndex(index);
        Node removed = null;
        if (index == 0) {
            removed = head;
            head = head.next;

        }
        Node cursor = head;
        Node previous = head;
        for (int i = 0; i < index; i++) {
            previous = cursor;
            cursor = cursor.next;
        }
        removed = cursor;
        if (index == size - 1) {
            removed = cursor;
            previous.next = null;
            tail = previous;

        } else {
            previous.next = cursor.next;
        }
        --size;
        return removed.data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node cursor = head;
        for (int i = 1; i < size; i++) {
            builder.append(getIndex(cursor.data) + ": "+cursor.data.getClass().getSimpleName() + " "  + cursor.data);
            cursor = cursor.next;
            builder.append("; ");
        }
        builder.append(" null... \nsize: ").append(size);
        return builder.toString();
    }
    public String toListString() {
        StringBuilder builder =new StringBuilder();
        Node cursor = head;
        for (int i = 0; i < size; i++) {
            builder.append(getIndex(cursor.data) + ": " + cursor.data.getClass().getSimpleName() + " " + cursor.data + "\n");
            cursor = cursor.next;
        }
        return builder.toString();
    }

    public int getIndex(T data){
        Node cursor = head;
        for (int i = 0; i < size; i++) {
            if (cursor.data.equals(data)) return i;
            cursor = cursor.next;
        }
        return -1;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return size == 0; //head == null; tail == null;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    class MyLinkedListIterator implements Iterator<T> {
        Node cursor = head;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            Node current = cursor.next;
            cursor = cursor.next;
            return current.data;
        }
    }

    private class Node {
        T data;
        Node next = null;

        public Node(T data) {
            this.data = data;
        }
    }
}
