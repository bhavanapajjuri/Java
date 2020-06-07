//avoids refering to variables and we refer to methods 
//which means we should(and concerned ) only know the methods of the class and not 
//the data and variables


//this is object to the class, instance variable
//void setName(String name) {
//		this.name = name;
//class varilable(this.name) = parameter variable(name)
// name indicates the closer and nearer value
//	}
//this.name = name

class Student{
	private String name;
	private int age;
	
	 void setName(String newName) {
		name = newName;
	}
	void setAge(int newAge) {
		age = newAge;
	}
	
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
	
}
public class SettersAndThisKeyword {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("I am bhavana");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}
}
