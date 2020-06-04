import java.util.Scanner;

public class SwitchCases {
	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         String name="";
         do {
        	 System.out.println("Enter name - ");
            name = s.next();
         switch(name) {
         case  "Bhavana":
        	     System.out.println("The name is bhavana");
                 break;        
         case  "Naveen":
    	     System.out.println("The name is Naveen");
             break;
         case "Padma":
    	     System.out.println("The name is padma");
             break;  
         case "Sudhakar":
    	     System.out.println("The name is Sudhakar");
             break; 
          default:
            	 System.out.println("Not a family member");
         }
         }while(name!="Sudhakar");
	}
}
