public class Fraction {
    private int num = 0;
    private int den = 1;

    Fraction(int num, int den){
        if(den==0){
            System.out.println("Error");
        return;
        }
        this.num = num;
        this.den = den;
        this.normalise();
        System.out.println(toString());
    }

    Fraction(int num){// нужна только тогда, когда значение по умолчанию не указано
        this(num, 1);
    }

    Fraction(){// нужна только тогда, когда значение по умолчанию не указано
        this(0, (int) (Math.random()*78));
    }

    Fraction(double num){
        this.den = 1;
        while (num%10 !=0){
            num*=10;
            den*=10;
        }
        this.num = (int)num;
        this.normalise();
        System.out.println(toString());
    }

    Fraction(Fraction f){
        this(f.num, f.den);
    }


    private int getGtd(){
        int a = num;
        int b = den;
        while (a!=0 &&b!=0){
            if (a>b) a %=b;
            else b%=a;
        }
        return a+b;
    }
    void normalise(){
        int gcd = getGtd();
        num/=gcd;
        den/=gcd;
    }
    @Override
    public String toString(){return num + "/"+ den;}

    double toDecimal(){
        return (double)num/den;
    }

    public void sum(Fraction f){
        num = num*f.den + f.num*den;
        den *= f.den;
        normalise();
    }

    public void mult(Fraction f){
        num = num*f.num;
        den *= f.den;
        normalise();
        System.out.println((double) num/den);
    }



}
