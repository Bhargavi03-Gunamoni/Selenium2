import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ReadDemo 
{
	public static void main(String[] args) throws IOException  {
		FileInputStream fis=null;//declare variable
		try {
			fis=new FileInputStream("Sdata.txt");  
		ObjectInputStream   ois= new ObjectInputStream(fis);
	        Object	o = ois.readObject();
	        Student s=null;
	        if (o instanceof Student)
	         s=(Student)o;
	        System.out.println(s.name +" " +s.dept+ " " + s.per);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}


