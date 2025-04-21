//Abstraction
//Definition: Sirf necessary details dikhana, baaki implementation chhupa dena.

abstract class vechicle{
    abstract void start();
}

class car extends vechicle{

    @Override
    void start() {
        System.out.println("Cars Start with Start Button...");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        vechicle veh  = new car();
        veh.start();


    }
}
