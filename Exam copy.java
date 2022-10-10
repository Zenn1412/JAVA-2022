import java.util.Scanner;

public class App {

static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

       System.out.println("Exam 2 practice problems");

       System.out.print("Enter temperature in celsius: ");
       double tempInCelsius = scan.nextDouble();
       double tempInFahrenheit =  toFarenheit(tempInCelsius);
       System.out.println(tempInCelsius + " C is equal to " + tempInFahrenheit + "°F");
       
       System.out.print("Enter temperature in fahrenheit: ");
        tempInFahrenheit = scan.nextDouble();
        tempInCelsius = toCelcius(tempInFahrenheit);
        System.out.println(tempInFahrenheit + "°F is equal to " + tempInCelsius +
        "°C");

        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = secondstoMinutes(seconds);
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes");

        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        minutes = hoursToMinutes(hours);
       System.out.println(hours + " is equal to " + minutes +  " minutes " );

       System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
       double gigabytes = megabyteToGigabyte(megabytes);
        System.out.println(megabytes + " is equal to " + gigabytes + " gigabytes ");

        System.out.print("Enter your 11 digit mobile number: ");
        String mobileNumber = scan.next();
          
        if (mobileNumber.length() == 11) {
              System.out.println("valid");
        } else{
              System.out.println("invalid");
              
        }

        System.out.print("Enter name of your bestfriend in UPPERCASE: ");
        String bestfriend = scan.next();

        if (bestfriend == bestfriend.toLowerCase()) {
        System.out.println("invalid");
       } else {
              System.out.println("valid");
       }
       System.out.print("Enter the capital of the philippines: ");
       String capital = scan.next();

       if (capital.toLowerCase().equals("manila") || capital.toUpperCase().equals("MANILA")) {
              System.out.println("valid");
       } else {
              System.out.println("invalid");
       }
       boolean valid = false;
       while (!(valid)) { 
       System.out.print("Enter one of the five human senses: ");
       String sense = scan.next();
       if (valid = sense.equals("sight") || sense.equals("touch") || sense.equals("hearing") || sense.equals("smell") || sense.equals("taste")) {
              System.out.println("valid!");
              break;
       }
       
       switch (sense) {
              case "sight":
              System.out.println("valid");
              break;
              case "touch":
              System.out.println("valid");
              break;
              case "hearing":
              System.out.println("valid");
              break;
              case "smell":
              System.out.println("valid");
              break;
              case "taste":
              System.out.println("valid");
              break;
              default: 
              System.out.println("invalid");
              break;
       }
       System.out.print("Enter your favorite drink: ");
       String drink = scan.nextLine();

       if (drink.contains("juice")) {
           System.out.print("Refreshing and natural!");
       } else if (drink.contains("coffee")) {
           System.out.print("Will keep you awake the entire day!");
       } else if (drink.contains("tea")) {
           System.out.print("Soothing!");
       } else if (drink.contains("soda") || drink.contains("cola")) {
           System.out.print("Refreshing but dont drink it too much!");
       } else if (drink.contains("wine")) {
           System.out.print("Classy!");
       } else if (drink.contains("beer")) {
           System.out.print("Dont drink this if you are driving!");
       } else if (drink.contains("water")) {
           System.out.print("The best!");
       }
       scan.nextLine();
       System.out.println("use the word \"love\" in a sentence");
       String love =scan.nextLine();
       
       if (love.contains("love")) {
        System.out.print("valid");
    } else {
        System.out.print("invalid");
    }

}
        }
      
      
      static double toFarenheit(double temperature) {
        return (temperature * 9 / 5) + 32;
      }
static double toCelcius(double temperature) {
    return (temperature - 9 / 5) + 32;
}
static double secondstoMinutes(double seconds) {
  return seconds / 60;
                 }
                 static double hoursToMinutes(double hours) {
                  return hours * 60;
               }
               static double megabyteToGigabyte(double megabytes) {
                return megabytes / 1000;
               }
}
              

   

       

    


