public class SmalBears extends Bears{
    public void setAge(int AgeOfAnimal){
        this.age = 0.5;
        if (AgeOfAnimal <=0.5){age = AgeOfAnimal;}
    }
    void Age(double a) {

        this.age += 0.75;

        if(age >= 1){System.out.println("Now i'm "+age+" years old and I'm not a small bear now");}
        else{System.out.println("Now i'm "+age+" years old and I'm small bear.");}

    }
    void say(String word) {
        System.out.println("I'm a small bear and I can't say something");
    }

    void go() {
        System.out.println("I'm bear "+ name+" and I can also sleep and eat.");
    }
    public void setWalk(String walkOfAnimal){
        walk = "sleep and eat";
    }

}
