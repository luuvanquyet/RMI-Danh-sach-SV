import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
		String nameString="rmi://localhost:5000/Student";
		StudentInterface studentInterface=(StudentInterface)Naming.lookup(nameString);
		while(true) {
			System.out.println("Moi ban chon chuc nang:");
		System.out.println("1. Them sinh vien");
		System.out.println("2. Hien thi danh sach");
		System.out.println("3. Hien thi top 3 sinh vien diem cao nhat");
		int lc=new Scanner(System.in).nextInt();
		
		ArrayList<Student> listStudents=new ArrayList<Student>();
		
		switch (lc) {
		case 1:
			Student st1=new Student();
			st1.input();
			studentInterface.addStudent(st1);	
		break;
		case 2:
			listStudents=studentInterface.getStudentList();
			for (Student student : listStudents) {
				System.out.println(student.toString());
			}
			break;
		case 3:
			listStudents=studentInterface.getTop3Students();
			for (Student student : listStudents) {
				System.out.println(student.toString());
			}
			break;
		}
		
		}
	}
}
