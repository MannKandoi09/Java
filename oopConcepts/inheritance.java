//Inheritance
//Definition: Ek class doosri class ke features ko inherit karti hai


class animal{
    void eat(){
        System.out.println("Animals eat Food..");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Doggy Barks...");
    }
}
public class inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat(); //Inherited Method
        d.bark(); //own Method

    }
}
