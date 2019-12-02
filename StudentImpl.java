import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class StudentImpl extends UnicastRemoteObject implements StudentInterface{

	public ArrayList<Student> students;
	protected StudentImpl( ArrayList<Student> students) throws RemoteException {
		super();
		this.students=students;
	}

	@Override
	public ArrayList<Student> addStudent(Student s) throws RemoteException {
		students.add(s);
		System.out.println("Da them sinh vien "+s.getName());
		
		return students;
	}

	@Override
	public ArrayList<Student> getStudentList() throws RemoteException {
		return students;
	}

	@Override
	public ArrayList<Student> getTop3Students() throws RemoteException {
		for (int i=0;i<students.size()-1;i++)
			for(int j=i;j<students.size();j++)
				if(students.get(i).getAVGMark()<students.get(j).getAVGMark())
				{
					Student tg=students.get(i);
					students.set(i, students.get(j));
					students.set(j, tg);
				}
		ArrayList<Student> top3=new ArrayList<Student>();
		top3.add(students.get(0));
		top3.add(students.get(1));
		top3.add(students.get(2));
		return top3;
	}
	
}
