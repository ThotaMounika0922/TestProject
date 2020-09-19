package Buying;
import java.util.function.Predicate; 
import java.util.*; 
import java.util.stream.Collectors; 
import java.util.stream.Stream; 
  
class User 
{ 
    String name, role; 
    User(String a, String b) { 
        name = a; 
        role = b; 
    } 
    String getRole() 
    { 
    	return role; 
    	} 
    String getName() 
    { 
    	return name; 
    	}  
    public String toString() { 
    return "User Name : " + name + ",  Role :" + role; 
    } 
  
    public static void main(String args[]) 
    {  
        List<User> users =  
            new ArrayList<User>(); 
        users.add(new User("mouni", "admin")); 
        users.add(new User("mahi", "member"));
        List admins = users.stream() 
        	    .filter((user) -> user.getRole().equals("admin")) 
        	    .collect(Collectors.toList()); 
        	          
        	    System.out.println(admins); 
        	    } 
        	} 