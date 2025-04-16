import java.util.ArrayList;
import java.util.List;

//Store member name, membership type, and duration.
class Members{
    String name;
    String memberShipType;
    int duration; //In Months

    public Members(String name, String memberShipType, int duration) {
        this.name = name;
        this.memberShipType = memberShipType;
        this.duration = duration;
    }
}
public class GymRecord {
    public static void main(String[] args) {
        List<Members> members = new ArrayList<>();
        members.add(new Members("Mann", "Premium", 12));
        members.add(new Members("Om", "Basic", 6));
        members.add(new Members("Manthan", "Standarad", 8));

        for (Members m : members){
            System.out.println("Name: " + m.name + " Has: " + m.memberShipType + " Membership" + " For: " + m.duration
             + " Months");
        }


    }
}
