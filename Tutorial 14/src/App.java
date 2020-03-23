class Person {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is "+name);
	}
	int calcRetirement() {
		int yearsLeft=65-age;
		return yearsLeft;
	}
}
public class App {
	public static void main(String[] args) {
	
	Person person1 = new Person();
	person1.name="Joe";
	person1.age=25;
	person1.speak();
	int years=person1.calcRetirement();
	System.out.println("Years until retirement: "+years);
	}
}
