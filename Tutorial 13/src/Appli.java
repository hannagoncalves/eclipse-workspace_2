class Person {
	//data
	String name;
	int age;
	//subroutines
	void speak() {
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
}

public class Appli {
	public static void main(String[] args) {
		Person person1= new Person();
		person1.name="Jhonny Blobber";
		person1.age=28;
		person1.speak();
		
		Person person2 = new Person();
		person2.name="Mary Berry";
		person2.age=19;
		person2.speak();
		
		System.out.println(person1.name);

	}
}
