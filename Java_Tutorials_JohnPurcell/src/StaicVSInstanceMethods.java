//static variables are class variable, which belong to the class
// and so there will be only one copy as there is only one class

class Things{
	String name;
	static String description;
	
	public void showName() {
		System.out.println("the name - "+name);
	}
	
	public static void showDesc() {
		System.out.println("thing1.name - "+description);
	}
}

public class StaicVSInstanceMethods {
	public static void main(String[] args) {
		Things thing1 = new Things(); // we need to create a varaible for accessing instance variables
		thing1.name= "Diary";
		//System.out.println("thing1.name - "+thing1.name);
		thing1.showName();
		
		Things.description ="Diary is a book";
		//System.out.println("Thing.description - "+Things.description);
	}

}
