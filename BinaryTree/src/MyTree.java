public class MyTree<T extends Comparable<T>> {

    private T data;
    private MyTree<T> leftChild;
    private MyTree<T> rightChild;

    public MyTree(T value) {
        this.data = value; //сть пустой один "кружочек"
        leftChild = null; //ветки-деревья по нулям
        rightChild = null;
    }

    public void add(T value) {
        if (value.compareTo(data) < 0) { //если value < данных в кружочке -> открываем новую ветку (левую)
            if (leftChild != null) leftChild.add(value);//если ветка уже есть -> спускаемся на один кружочек вниз
            else leftChild = new MyTree<>(value);
        } else if (value.compareTo(data) > 0) {
            if (rightChild != null) rightChild.add(value);
            else
                rightChild = new MyTree<>(value);
        }
    }

    public boolean contains(T value) {
        if (value.compareTo(data) == 0) return true;
        if (value.compareTo(data) < 0) {
            if (leftChild != null) {
                return leftChild.contains(value);
            }
            return false;
        }
        if (value.compareTo(data) > 0) {
            if (rightChild != null) {
                return rightChild.contains(value);
            }
            return false;
        }
        return false;
    }

    public void printTree(){
        printTree(0);
    }
    public void printTree(int level) {
        if (leftChild != null) leftChild.printTree(level + 1);
        for (int i = 0; i < level; i++) System.out.print("    ");
        System.out.println(data);
        if (rightChild != null) printTree(level + 1);
    }

}


