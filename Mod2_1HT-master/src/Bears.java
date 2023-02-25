public class Bears extends Animals{

    private int newBear = 0;
    void go() {
        System.out.println("I'm bear "+ name+" and I can " + walk );
    }

    @Override
    void say(String word) {
        this.word = word;
        System.out.println("I'm bear and I can say "+ word + ".");
    }

    @Override
    void Age(double a) {
        this.age += 0.75;
        System.out.println("Now i'm "+age+" years old and I have "+newBear+" small bears.");
    }
}
