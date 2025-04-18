//Method With Return, No Parameters

class Whether{
    int getTemp(){
        return 45;
    }
}
public class Method3 {
    public static void main(String[] args) {
        Whether w = new Whether();
        int temp = w.getTemp();
        System.out.println("Today's Temprature is: " + temp + " Degree");

    }
}
