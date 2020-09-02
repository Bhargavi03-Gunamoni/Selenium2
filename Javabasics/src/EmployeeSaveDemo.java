import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSaveDemo {

	public static void main(String[] args) {
		Employee e =new Employee();
		e.name="Honey";
		e.sal=1500;
		e.profile="HR";
		e.comm=500.00;
		try {
			FileOutputStream fos=new FileOutputStream("Edata.txt");
			ObjectOutputStream ops=new ObjectOutputStream(fos);
			ops.writeObject(e);
			System.out.println("done");
			
		}catch(Exception e1) {
		
e1.printStackTrace();
	}
	}

}
	
