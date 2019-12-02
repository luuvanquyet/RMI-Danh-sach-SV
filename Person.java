import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Person implements Serializable {
	
	protected String name;
	protected int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void input()
	{
		System.out.println("Input name: ");
		this.name=new Scanner(System.in).next();
		System.out.println("Input age: ");
		this.age=new Scanner(System.in).nextInt();
	}

	@Override
	public String toString() {
		return "Name: "+name+"\nAge:"+age+"\n";
	}
	
	
}