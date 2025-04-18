//1. Method Without Return, Without Parameters

class Light{
    void turnOn(){
        System.out.println("Light is Turned On!!!!!");
    }
}
public class Method1 {
    public static void main(String[] args) {
        Light l = new Light();
        l.turnOn();
    }
}
