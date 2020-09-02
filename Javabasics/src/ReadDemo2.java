import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadDemo2 {

	public static void main(String[] args) throws IOException {
	
FileInputStream fis=null;
try {
fis=new FileInputStream("Edata.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Object o=ois.readObject();
Employee e=null;
if(o instanceof Employee)
	e=(Employee)o;
System.out.println(e.name + " " + e.sal +" "  + e.profile + " " + e.comm);
}catch(Exception e) {
	e.printStackTrace();
}
	}
}
