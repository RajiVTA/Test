package review2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add("Raji");
		ar.add(null);
		ar.add('A');
		ar.add(null);
		ar.add(345.678);
		ar.add(12.56f);
		ar.add(35);
		
		System.out.println("the list is = " + ar.size());
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);
		System.out.println(ar.get(1));
		

	}

}
