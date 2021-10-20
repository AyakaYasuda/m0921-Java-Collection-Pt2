import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<String> countries = new LinkedList<>();
		countries.add("Canada");
		countries.add("USA");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Poland");
		
		new Main().printList(countries);

	}
	
	void printList(List<String> list) {
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}
