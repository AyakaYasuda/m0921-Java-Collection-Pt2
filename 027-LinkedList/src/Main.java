import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		System.out.println(linkedList);
		
		linkedList.add(1,5);
		System.out.println(linkedList);
		
		linkedList.remove(0);
		System.out.println(linkedList);
		


	}

}
