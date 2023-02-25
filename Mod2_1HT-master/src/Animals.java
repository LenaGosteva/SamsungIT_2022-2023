public abstract class Animals {
    private int paws = 4;
    double age = 2.0;
    String walk = "coming";
    protected String name;
    String word;

    public void setName(String AnimalName){
        name = AnimalName;
    }
    public String getName(){

        return name;
    }


    public void setWalk(String walkOfAnimal){
        walk = walkOfAnimal;
    }
    public String getWalk(){

        return walk;
    }
    abstract void go();

    public void setAge(int AgeOfAnimal){
        age = AgeOfAnimal;
    }
    public double getAge(){
        return age;
    }
    abstract void Age(double a);



    public void setWord(String wordOfAnimal){
        word = wordOfAnimal;
    }

    public String getWord(){

        return word;
    }
    abstract void say(String word);
}
