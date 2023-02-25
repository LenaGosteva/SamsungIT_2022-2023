public class Horses extends Animals{
    @Override
    void go() {
        System.out.println("I'm horse "+ name+" and I can " + walk );
    }

    @Override
    void say(String word) {
        this.word = word;
        System.out.println(word);
    }

    @Override
    void Age(double a) {
        this.age += 1.0;
        System.out.println("Now i'm "+age+" years old)");
    }
}
