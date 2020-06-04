import java.util.Scanner;

public class SwitchCasesForCharacters {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a character ");
        char c = s.next().charAt(0);
        
        switch(c) {
        case 'a':System.out.println("Enter a character a");
                 break;
        case 'b':System.out.println("Enter a character b");
        break;
        case 'c':System.out.println("Enter a character c");
        break;
        default: System.out.println("Didn't enter a valid character");
        }
	}
}
