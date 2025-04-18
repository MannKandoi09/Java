//Method With Parameters & Return

class Calculator{
    int add(int a , int b){
        return  a + b;
    }
}

public class Method4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
       int result =  c.add(10,10);
        System.out.println("Result: " + result);

    }
}
