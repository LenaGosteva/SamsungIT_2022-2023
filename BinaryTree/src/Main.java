public class Main {
    public static void main(String[] args) {

        MyTree<Integer> myTree = new MyTree<>(0);
        myTree.add(12);
        myTree.add(1);
        myTree.add(0);
        myTree.add(0);
        myTree.add(11);
        myTree.add(3);
        myTree.printTree();
    }
}