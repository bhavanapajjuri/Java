class PersonDetails{
	String personName;
	int personAge;
	int retirementAge() {
		return 65-personAge;
	}
}
//will show how to get values from other classs methods
public class GettersAndReturnValues {
	public static void main(String[] args) {
		PersonDetails p1 = new PersonDetails();
		p1.personAge = 45;
		System.out.println(p1.retirementAge());
	}
}
