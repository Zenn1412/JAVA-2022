import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int ave;

        ave = 75;
        if (ave > 74 ) {
            System.out.println( " You passed! ");
        }
        else {
            System.out.println( " Sorry you failed!");
        }
       
        String psswd = "Secret101";

        if (psswd != "Secret101 ") {
            System.out.println(" Password accepted");
        }
   
        float gwa;
        System.out.println("type Average ");
        Scanner x= new Scanner(System.in);
        gwa = x.nextFloat();
        System.out.println(gwa);

        if (gwa > 89 && gwa < 92); {
            System.out.println(" Cum Laude ");
        }  if (gwa > 92 && gwa < 97) {
            System.out.println("  Magna Cum Laude ");
        }
          else if (gwa > 96 && gwa < 101) {
            System.out.println(" Suma Cum Laude ");
          } else if (gwa < 88) {
            System.out.println(" No Honors for you ");
          } else if (gwa > 100) {
            System.out.println(" Invalid grade ");
          }

        if (gwa > 75 || gwa < 70) {
            System.out.println(" Valid Grade ");
        } else {
            System.out.println(" Invalid grade ");
        }
   
    }
}




    







