
package digitalconecjavaclass;


public class PyramidPattern {
    
    public static void main(String[] args) {
        int s=4,l=1,i,j;
        
            for(i=1;i<=5;i++){
        
            for(j=1;j<=s;j++){
                System.out.print(" ");
   
            }
            for(j=1;j<=l;j++){
                System.out.print("*");
            
            }
            System.out.println("");
            s--;
            l+=2;
        }
            
    }
    
}
