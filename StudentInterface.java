import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface StudentInterface extends Remote {
	public  ArrayList<Student> addStudent(Student s) throws RemoteException;
	public ArrayList<Student> getStudentList () throws RemoteException;
	public ArrayList<Student> getTop3Students () throws RemoteException;
}
