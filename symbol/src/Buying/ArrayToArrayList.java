package Buying;
import java.util.*;

public class ArrayToArrayList {
     public static void main(String[] args) {

	  
	  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

	  
	  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

	  
	  citylist.add("New City2");
	  citylist.add("New City3");

	  
	  for (String str: citylist)
	  {
		System.out.println(str);
       	  }
      }
}

