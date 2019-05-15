package linkedlist;

public class App {
	
	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		
		list.insert("AAA");
		list.insert("BBB");
		list.insert("CCC");
		list.insert("DDD");
		
		list.remove("BBB");
		
		list.traverseList(); 
		System.out.print("\nsize:"+list.size());
		
		
	}
}
