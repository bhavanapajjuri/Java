class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is - "+ name+" and my age is - "+ age);
	}
	void sayHello() {
		System.out.println("Hello there");
	}
	
}
public class ClassesAndObjects {
	public static void main(String[] args) {
       Person p1 = new Person();
       p1.name="Bhavana";
       p1.age = 24;
       p1.speak();
       p1.sayHello();
       
       Person p2 = new Person();
       p2.name="Naveen";
       p2.age = 28;
       p2.speak();
       
       System.out.println(p1.name);
       System.out.println(p2.name);
	}
}
