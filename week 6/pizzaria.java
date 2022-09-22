import java.util.Scanner;


public class App {
  static Scanner scan = new Scanner(System.in);
    public static void main (String[] args) {
      orderPizza();
    }
  static void orderPizza() {
  System.out.println("welcome to PizzaHut");
  System.out.println("choose a Pizza ");
  System.out.println("choose A if Shrimp pizza, B if hawaiian pizza");
  System.out.println("Enter your choice: ");
  char choice =scan.next().charAt(0);
    
 String pizza = "";
 double price = 0;

 switch (choice) {
  case 'A': pizza = "Shrimp pizza";
            price = 505.00;
    
    break;
    case 'B': pizza = "hawaiian pizza"; 
              price = 555.00;
 
  default: System.out.println("choose A or B!");
    return;
    
 }
 System.out.println("your order  is: " + pizza);
 System.out.println("your order amount is: " + price);

 
    System.out.println("Choose a payment method: ");

    System.out.println("if cash on delivery Enter COD");
    System.out.println("if credit card enter CC");

    System.out.print("Enter your payment method: ");
    String paymentMethod = scan.next();

switch (paymentMethod) {
  case "COD": System.out.println("Please prepare your money upon delivery");
    break;
case "CC": System.out.print("Please Enter your card number: ");
          int cardNumber = scan.nextInt();
    break;
  default: System.out.println("please enter on choices only!");
    return;
} 
System.out.println("please enter your location");
System.out.print("Input location: ");
String location =scan.next();

switch (location) {
  case "sanvicente": System.out.println("your order is arriving at san vicente");
    
    break;
    case "cabiao": System.out.println("your order is arriving at cabiao");
    break;
  default:System.out.println("cant find location, please enter:");
    return; 
}

System.out.println("thank you for ordering!");

  }

  
 }

 


  



    
  
    