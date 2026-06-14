// date - 17/3/25
abstract class Myclass{
    public void mymethod(){
        System.out.println("Hello from Non Abstarct Method");
    }
    abstract void absmethod();
}

// we can Define interface by default keyword
interface myinterface{
    default void mymethod(){
        System.out.println("Hello from Interface");
    }

}

interface interclass{
    void myintermethod();
}

class sample1 implements myinterface,interclass{
    public void intermethod2(){
        System.out.println("Override the method from myinterface");
    }

    @Override
    public void myintermethod() {
        System.out.println("Hello");
    }
}



class sample extends Myclass{

    @Override
     public void absmethod() {
        System.out.println("Hello i am overriding  abstarct method");
    }
    public void myfun(int a, int b){
        System.out.println(a + " " + b);
    }
}

public class AbsPra {
    public static void main(String[] args) {
        sample s1 = new sample();
        s1.myfun(10,20);
        s1.absmethod();
        s1.mymethod();

        myinterface m1 = new myinterface() {

        };
        m1.mymethod();

        sample1 z1 = new sample1();
        z1.intermethod2();
        z1.myintermethod();
        z1.mymethod();


    }

}
