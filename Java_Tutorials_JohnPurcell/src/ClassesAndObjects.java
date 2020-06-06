class Person{
	String name;
	int age;
	
}
public class ClassesAndObjects {
	public static void main(String[] args) {
       Person p1 = new Person();
       p1.name="Bhavana";
       p1.age = 24;
       
       Person p2 = new Person();
       p2.name="Naveen";
       p2.age = 28;
       
       System.out.println(p1.name);
       System.out.println(p2.name);
	}
}
