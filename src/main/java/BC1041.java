import java.util.Scanner;
    
public class BC1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                
                if ((y == 0) && (x == 0)) {
                    System.out.println("Origem");
                    
                } else if (x == 0) {
                    System.out.println("eixo y");  
                    
                } else if (y == 0) {
                    System.out.println("eixo x");
                    
                } else if (y > 0 && x > 0) {
                    System.out.println("Q1");
                    
                } else if (y > 0 && x < 0) {
                    System.out.println("Q2");
                    
                } else if (y < 0 && x < 0) {
                    System.out.println("Q3");
                    
                } else if (y < 0 && x > 0) {
                    System.out.println("Q4");
                }
    }
}