//static variables are class variable, which belong to the class
// and so there will be only one copy as there is only one class

class Thing{
	String name;
	static String description;
}

public class StaicVSInstanceVariables {
	public static void main(String[] args) {
		Thing thing1 = new Thing(); // we need to create a varaible for accessing instance variables
		thing1.name= "Diary";
		System.out.println("thing1.name - "+thing1.name);
		
		Thing.description ="Diary is a book";
		System.out.println("Thing.description - "+Thing.description);
	}

}
