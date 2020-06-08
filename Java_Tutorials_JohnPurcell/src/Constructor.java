// constructor provides instance of a class

//we can create parameterized constructors by giving parameters


// we can call a constructor from other constructor by providing this() 
//[unparameterized constructor that is called and this(<parameters>) should be in the first line of a constructor
class Machine {
	private static String name;
	private int cost;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Machine() {
		this(name, 30000);
		System.out.println("this is machine constructor");
		setName("invertor");
	}
	
	public Machine(String name, int cost) {
	//	this();
		System.out.println("this is a parameterized machine constructor");
	}
}

public class Constructor {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		System.out.println("the name is :" + machine1.getName());
		
		Machine machine2 = new Machine("AC", 25000);
	}
}
