import java.util.Scanner;

public class App {

static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

//      System.out.println("enter 5 human sesnses");
//      String sense = scan.next();
boolean valid = false;
while(!valid) {
       System.out.print("Enter 5 human senses: ");
       String sense =scan.nextLine();
       


        switch (sense) {
            case "sight":
                System.out.println("Valid ");
                break;
            case "smell":
                System.out.println("Valid ");
                break;
            case "hearing":
                System.out.println("Valid ");
                break;
            case "touch":
                System.out.println("Valid ");
                break;
            case "taste":
                System.out.println("Valid ");
                break;
            default:
                System.out.println("invalid! ");
                break;
        }
                int senses = 1; 
                do{
                     System.out.println("proceed");
                     senses--;
                }while (senses != 0);
                }
  
 }
                }
             



    
    


 


    
