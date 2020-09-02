import java.util.List;
import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("bhanu");
		lst.add("bhargavi");
		lst.add("honey");
		lst.add("raju");
		lst.add("chitti");
		lst.add("nani");
		List<String> ost=new ArrayList<>(lst);
		for(String val:ost) {
			System.out.println(val);
		}
		
		System.out.println("Extra");
		
	

	}

}
