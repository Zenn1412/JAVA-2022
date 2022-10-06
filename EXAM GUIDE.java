import java.util.Scanner;

public class App {

static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

       System.out.println("Exam 2 practice problems");

       System.out.print("Enter temperature in celsius: ");
       double tempInCelsius = scan.nextDouble();
       double tempInFahrenheit = toFahrenheit(tempInCelsius);
       System.out.println(tempInCelsius + " C is equal to " + tempInFahrenheit + "°F");
       
       System.out.print("Enter temperature in fahrenheit: ");
        tempInFahrenheit = scan.nextDouble();
        tempInCelsius = toCelsius(tempInFahrenheit);
        System.out.println(tempInFahrenheit + "°F is equal to " + tempInCelsius +
        "°C");

        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = secondsTominutes(seconds);
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes");

        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        minutes = hoursToMinutes(hours);
       System.out.println(hours + " is equal to " + minutes +  " minutes " );

       System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
       double gigabytes = megabyteToGigabytes(megabytes);
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
       System.out.print("Enter one of the five human senses: ");
       String sense = scan.next();

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
              case "tase":
              System.out.println("valid");
              break;
              default: 
              System.out.println("invalid");
              break;
       }
        }
        
    
       static double toFahrenheit(double temperature) {
              temperature = (temperature * 9 / 5) + 32;
              return temperature;
       }
              static double toCelsius(double temperature) {
                     temperature = (temperature - 32) * 5 / 9;
                     return temperature;
                 }
                 static double secondsTominutes(double seconds) {
                     double minutes = seconds / 60;
                     return minutes;
                 }
               static double hoursToMinutes(double hours) {
              double minutes = hours * 60;
                     return minutes;
               }
               static double megabyteToGigabytes(double megabytes) {
                  double gigabytes = megabytes   / 1000;
                     return gigabytes;
               }
              
              }

    



