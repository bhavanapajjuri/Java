//this file wont work, it returns run time error and no compilation errors
// as public class is not having main method we get run time error

class Family{
	public static void main(String[] args) {
		CheckingHowMainMethodsWorksWithClasses c1 = new CheckingHowMainMethodsWorksWithClasses();
	    System.out.println(c1.name);
	}
}
public class CheckingHowMainMethodsWorksWithClasses {
	String name = "Bhavana";

}
