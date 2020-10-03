package Bookdomain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Book {
	static Scanner scan=new Scanner(System.in);
	//connecting to database
	private static Connection getconnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy","root","Mounika@123");
			return con;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}


	


	

	//Inserting Operation 
	public static int Insert() {
		
		Bookpojo bp=new Bookpojo();
		System.out.println("Enter the ISBN number");
	    bp.setIsbn(scan.nextInt());
		System.out.println("Enter the book name");
		bp.setBookName(scan.next());
		System.out.println("Enter the Author name");
		bp.setAuthorName(scan.next());
		System.out.println("Enter the Edition");
		bp.setEdition(scan.nextInt());
		try {
			Connection con=getconnection();
			//inserting the data in to the table
			String sql="insert into Book(Isbn,BookName,AuthorName,Edition) values (?,?,?,?)";
			PreparedStatement psmt=con.prepareStatement(sql);
			psmt.setInt(1, bp.getIsbn());
			psmt.setString(2, bp.getBookName());
			psmt.setString(3, bp.getAuthorName());
			psmt.setInt(4, bp.getEdition());
			// execute query
			int x=psmt.executeUpdate();
			psmt.close();
			con.close();
			if(x==1) {
				System.out.println("Data inserted sucessfully!!!!!!!!!!!!!!!");
			}
			else {
				System.out.println("Failed to insert...Retry!!!!!!");
			}
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		return 1;
		
	}
	//Fetching operation
	public static int Fetch() {
		Bookpojo bp=new Bookpojo();
		System.out.println("Enter the ISBN to get book detatils");
		bp.setIsbn(scan.nextInt());
		try {
			Connection con=getconnection();
			//by using isbn fetch the details
			String sql="select * from Book where Isbn=?";
			
					PreparedStatement psmt=con.prepareStatement(sql);
					psmt.setInt(1, bp.getIsbn());
                    
			//query execute
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				String isbn=rs.getString(1);
				String Bookname=rs.getString(2);
				String authorName=rs.getString(3);
				String edition=rs.getString(4);
				System.out.println("Booking details.....");
				System.out.println("Isbn:"+isbn+"\n BookName:"+Bookname+"\n Edition:"+edition+"\n author name:"+authorName);
				System.out.println("Details fetched successfully");
			
			}
			rs.close();
			psmt.close();
			con.close();
		
			System.out.println("Entered wrong ISBN...!");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occcured"+e);
		}
		return 1;
				
				
			}
	//update operation
	public static int Update()  {
		Bookpojo bp=new Bookpojo();
		System.out.println("Enter the isbn to update");
		bp.setIsbn(scan.nextInt());
		System.out.println("Enter the Edition to update");
		bp.setEdition(scan.nextInt());
		try {
			Connection con=getconnection();

			//by using isbn number update the edition
			String sql="update Book set Edition=?  where Isbn=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
		
			
			pstmt.setInt(1, bp.getEdition());
		
			pstmt.setInt(2, bp.getIsbn());
			//query execute
		int x=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
			
			if(x==1)
			{
				System.out.println("updated successfully!!!!!!!!");
			}
			else {
				System.out.println("Failed to update!!!!!!!!");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 1;
		
		
	}
		
	//Delete operation
public static int Delete() {
	//created object for bookpojo
	Bookpojo bp=new Bookpojo();
	System.out.println("Enter the ISBN number to delete");
	bp.setIsbn(scan.nextInt());
	try {
		Connection con=getconnection();
		//by using isbn delete the  record
		String sql="delete from Book where Isbn=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, bp.getIsbn());
		//query execute
		int x=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		if(x==1)
		{
			System.out.println("Data Deleted successfully!!!!!!!!!!!");
		}
		else
		{
			System.out.println("not deleted data successfully");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return 1;
		
	}
}

	


		
	




	
	

	



