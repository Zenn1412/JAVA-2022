import java.util.Scanner;

public class App {

static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

       System.out.println("Exam 2 practice problems");

       System.out.print("Enter temperature in celsius: ");
      double tempInCelcius =scan.nextDouble();
      double tempInfarenheit = toFarenheit(tempInCelcius);
      System.out.println(tempInCelcius + "C is equal to " + tempInfarenheit + "F");

      System.out.print("Enter temperature in fahrenheit: ");
        double tempInFahrenheit = scan.nextDouble();
        tempInCelcius = toCelcius(tempInFahrenheit);
        System.out.println(tempInFahrenheit + "F is equal to " + tempInCelcius + "C");

        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = toMinutes(seconds);
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes");


    }
      static double toFarenheit(double temperature) {
        return (temperature * 9 / 5) + 32;
      }
static double toCelcius(double temperature) {
    return (temperature - 9 / 5) + 32;
}
static double toMinutes(double seconds) {
    return (seconds / 60);
}
    } 

       

    


