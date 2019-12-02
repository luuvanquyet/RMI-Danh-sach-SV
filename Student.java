import java.awt.Dimension;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person  implements Serializable{
	private int studentId;
	private double avgMark;
	
	public Student()
	{
		super("", 0);
		this.studentId = 0;
		avgMark=0;
	}
	
	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
		
	}
	
	public double getAVGMark()
	{
		return avgMark;
	}
	
	public Student(int studentId,String name, int age,  double mark ) {
		super(name, age);
		this.studentId = studentId;
		avgMark=mark;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public void input()
	{
		System.out.println("Create new Student record");
		System.out.println("Input student id:");
		studentId=new Scanner(System.in).nextInt();
		super.input();
		System.out.println("Input average mark:");
		avgMark=new Scanner(System.in).nextDouble();
		
	}
	@Override
	public String toString() {
		String str= "\nStudent id: "+studentId+"\n"+super.toString();
		
		str+= "Average mark: "+avgMark;
		return str;
	}
}