public class App {
    public static void main(String[] args) throws Exception {

        char [][] Array4x3 = {{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J', 'K', 'L'}};

        // for (int rows = 0; rows < array_3x4.length; rows++) {
            
        //     System.out.println("");
        //     for (int columns = 0; columns < array_3x4.length; columns++) {
        //         System.out.print(array_3x4[rows][columns]);
        //     }
    
                // Outer loop
                for (int row = 0; row < Array4x3.length; row++) {
        System.out.println(" ");
                    // inner loop
                    for (int column = 0; column < 3; column++) {
                            System.out.print(Array4x3[row][column]);
                    }   
                }
            }
}
        // // L TO A
        // for (int rows = array_3x4.length - 1; rows >= 0; rows--) {
            
        //     System.out.println("");

        //     for (int columns = 0 ; columns < array_3x4.length; columns++) {

        //         System.out.print(array_3x4[rows][columns]);
    // }
    
    //  }