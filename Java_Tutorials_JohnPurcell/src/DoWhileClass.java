import java.util.Scanner;

public class DoWhileClass {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
//        System.out.println("enter a number");
//        int val = s.nextInt();
//        
//        while(val!=5) {
//        	System.out.println("Enter a number");
//        	val = s.nextInt();
//        }
        int val =0;
        do {
        	System.out.println("Enter a number");
        	val = s.nextInt();
        }while(val!=5);
        
        System.out.println("Got 5!");
	}
}
