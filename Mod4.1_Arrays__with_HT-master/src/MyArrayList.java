import java.util.Iterator;
import java.util.function.Consumer;

public class MyArrayList<T> implements Iterable<T> {
    private Object[] data;
    private int capacity;
    private int size;

    public int size() {
        return size;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyArrayList() {
        data = new Object[10];
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        return (T) data[index];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        data[index] = value;
    }

    public void add(T value) {
        if (capacity == size) {
            capacity *= 1.5;
            Object[] newData = new Object[capacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size] = value;
        ++size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[size - 1] = null;
        --size;
    }

    public void addAll(T... values) {
        for (T element : values) {
            this.add(element);
        }
    }

    public boolean contains(MyArrayList<T> b) {
        Object[] newArr = new Object[b.size];
        System.arraycopy(b, 0, newArr, 0, b.size);
        if (this.size != b.size) return false;
        for (int i = 0; i < b.size; i++) {
            if (data[i] != newArr[i]) {
                return false;
            }

        }
        return true;
    }

    public int indexOf(T value) {
        for (int i = 0; i < this.size; i++) {
            if(data[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<T> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            return (T) data[cursor++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(cursor);
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Iterator.super.forEachRemaining(action);
        }
    }


}
