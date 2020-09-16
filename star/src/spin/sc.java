package spin;

import java.util.ArrayList;

public class sc {
	public static void main(String [] args) {
		ArrayList<String>items=new ArrayList<>();
		items.add("shirt");
		
		items.add("tie");
		items.add("belt");
		items.add("socks");
		System.out.println(items);
		items.add(2,"shoes");
		System.out.println(items);
		if(items.contains("shirt")) {
			System.out.println("shirt was found");
		}
		else
		{
			System.out.println("shirt wasnt found");
		}
		
		
		
	}

}
