public class App {
    public static void main (String[] args) {
          // Conditional Structure
          boolean Suspended = true;
          boolean Holiday = false;
  
          if (Suspended) {
            System.out.println(" Chill at Home ");
          }
          else if (Holiday) {
               System.out.println("Spend time with fam");
          }
           else {
               // Step 1
               rideJeep();
                            
               // Step 2
               rideLRT();
               // Step 3
               rideTricycle() ;
               // Step 4
               walk();
           }
          }
  static void rideJeep() {
   System.out.println("ride jeep");
  }
  static void rideLRT() {
    System.out.println("ride lrt");
  }
  static void rideTricycle(){
    System.out.println("ride tric");
  }
  static void walk() {
    System.out.println("walk");
  }
}

  
    