
package digitalconecjavaclass;

import java.util.Scanner;


public class CelciousFindOut {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double farn,celcious;
        
        System.out.print("Enter farenhight :");
        farn = input.nextDouble();
        
        celcious = 1.8 * farn + 32;
        
        System.out.println("celcious = "+celcious);
        
        
    }
    
}
