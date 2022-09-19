public class App {
    public static void main(String[] args) throws Exception {
      boolean suspended = true;

      if (suspended) {
      System.out.println("stay at home");
      
      } else {

        rideJeep();

        walk1();

        walk2();

      }
    }

    static void rideJeep() {
        System.out.println("Ride jeep along katipunan Street");
        System.out.println("Exit jeep along Sumulong Highway");
    }

    static void walk1() {
      System.out.println("walk to chuchu");
    }
  
    static void walk2() {
        System.out.println("walk to chuchu 2");
    }
}
    