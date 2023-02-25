public class Trinity<T extends Comparable<T>> implements Comparable<Trinity<T>>{
    public Trinity<T> first;
    public Trinity<T> second;
    public Trinity<T> third;

    public Trinity(Trinity<T> first, Trinity<T> second, Trinity<T> third){
        this.first = first;
        this.second = second;
        this.third = third;
        if (first.compareTo(second)<0) {
            this.first = second;
            this.second = first;
        }
        if (second.compareTo(third)<0){
            if (first.compareTo(third)>0) {
                this.second = third;
                this.third = second;
            }
            else{
                this.first = third;
                this.second =first;
                this.third = second;
            }
        }
    }
    public Trinity<T> getFirst() {
        return first;
    }

    public Trinity<T> getSecond() {
        return second;
    }

    public Trinity<T> getThird() {
        return third;
    }

    public void setFirst(Trinity<T> first) {
        this.first = first;
    }

    public void setSecond(Trinity<T> second) {
        this.second = second;
    }

    public void setThird(Trinity<T> third) {
        this.third = third;
    }

    @Override
    public int compareTo(Trinity<T> o) {
         return this.compareTo(o);
    }
}
