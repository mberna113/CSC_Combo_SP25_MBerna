package InClass;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList myList = new LinkedList();
		
		myList.insert(2);
		myList.insert(9);
		myList.insert(23);
		myList.insert(562);
		myList.insert(245);
		myList.insert(13);
		myList.insert(31);

		myList.show();
		
		myList.insertHead(1313);
		
		myList.show();
		
		myList.insertAt(117, 3);
		
		myList.show();
		
		myList.remove(2);
		
		myList.show();
		
		myList.remove(0);
		
		myList.show();
		

	}//end main

	
	
	
}//end class
