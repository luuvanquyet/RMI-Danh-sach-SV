import java.rmi.Naming;
import java.util.ArrayList;

public class Server {
	public static ArrayList<Student> students;

	public static void main(String[] args) throws Exception {
		students = new ArrayList<Student>();
		StudentInterface studentInterface=new StudentImpl(students);
		Naming.rebind("rmi://localhost:5000/Student", studentInterface);
		System.out.println("Ready for client");
	}
}
