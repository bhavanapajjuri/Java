import java.util.Scanner;

public class SwitchCaseForIntegers {
	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       System.out.println("Enter  a number");
       int num = s.nextInt();
       
       switch(num) {
       case 1:
    	   System.out.println("YOU ENTERED 1");
    	   break;
       case 2:
    	   System.out.println("YOU ENTERED 2");
    	   break;
       case 3:
    	   System.out.println("YOU ENTERED 3");
    	   break;
       case 4:
    	   System.out.println("YOU ENTERED 4");
    	   break;
       default:System.out.println("its not a valid number");
       }
	}
}
