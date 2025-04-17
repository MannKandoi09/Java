//Project: Mini Food Ordering System
//Show menu
//Place order
//Show total bill
//Exit

//Uses:
//ArrayList for cart
//HashMap for menu
//OOP: MenuItem, OrderItem classes


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class menuItem{
    int id;
    String name;
    double price;

    public menuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class orderIteem{
    menuItem item;
    int quantity;

    public orderIteem(int quantity, menuItem item) {
        this.quantity = quantity;
        this.item = item;
    }

    public double getTotalPrice(){
        return item.price * quantity;
    }
}



public class MiniFoodOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Integer, menuItem> menu = new HashMap<>();
        ArrayList<orderIteem> cart = new ArrayList<>();


        menu.put(1, new menuItem(1, "Burger", 80));
        menu.put(2, new menuItem(2, "Pizza", 150));
        menu.put(3, new menuItem(3, "Fries", 60));
        menu.put(4, new menuItem(4, "Coke", 50));
        menu.put(5, new menuItem(5, "SandWich", 90));

        while (true){
            System.out.println("\n --------------Food Menu------------------------");

            for (Map.Entry<Integer, menuItem> entry : menu.entrySet()){
                menuItem m = entry.getValue();
                System.out.println(m.id + " . " + m.name + " -$" + m.price);
            }

            System.out.println("6. View Cart");
            System.out.println("7. CheckOut");
            System.out.println("8. Exit");
            System.out.println("Choose Item Number to Choose or Option: ");
            int choice = scan.nextInt();

            if (choice >= 1 && choice <= 5){
                menuItem selectedItem = menu.get(choice);
                System.out.println("Enter Quantity.");

                int qty = scan.nextInt();
                cart.add(new orderIteem(qty, selectedItem)); //May be Error
                System.out.println("Added to Cart: " + selectedItem.name + " x" + qty);
            } else if (choice == 6) {
                System.out.println(" Your Cart");
                double total = 0;
                for (orderIteem o : cart){
                    double price = o.getTotalPrice();
                    total += price;
                    System.out.println(o.item.name + " x" + o.quantity + " =$" + price);
                }
                System.out.println("Total: $" + total);
            } else if (choice == 7) {
                System.out.println("\n Checkout");
                double total = 0;
                for (orderIteem o : cart){
                    double price = o.getTotalPrice();
                    total += price;
                    System.out.println(o.item.name + " x" + o.quantity + " =$" + price);
                }
                System.out.println("Final Total Bill : $" + total);
                System.out.println("ThankYou for Ordering!");
                break;
            } else if (choice == 8 ) {
                System.out.println("Exiting... Have a Nice  Day");
                break;
            }else {
                System.out.println("Invalid Choice. Try Again!");
            }
        }
        scan.close();


    }
}
