package case_study;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;	

public class Book {
	static Scanner scan=new Scanner(System.in);
	
	public static int Insert()
	{
		int rowinsert=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy","root","Mounika@123");
		int Isbn,Edition;
		String BookName,AuthorName;
	
		System.out.println("Enter the ISBN number");
		Isbn=scan.nextInt();
		System.out.println("Enter the book name");
		BookName=scan.next();
		System.out.println("Enter the author name");
		AuthorName=scan.next();
		System.out.println("Enter the Edition");
		Edition=scan.nextInt();
		
		String sql="insert into Book(Isbn,BookName,AuthorName,Edition) values (?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		pstmt.setInt(1, Isbn);
		pstmt.setString(2, BookName);
		pstmt.setString(3, AuthorName);
		pstmt.setInt(4, Edition);
		
		rowinsert=pstmt.executeUpdate();
		if(rowinsert > 0)
		{
			System.out.println("Details are inserted successfully");
		}
		else {
			System.out.println("Failed to insert...Retry!!!!!!");
		}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return rowinsert;
	}
	
	public static void Fetch()
	{
		int Isbn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy","root","Mounika@123");
			
			System.out.println("Enter the ISBN to get book detatils");
			Isbn=scan.nextInt();
			
			String sql="select * from Book where Isbn=?";
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, Isbn);
			
			ResultSet rs=pstm.executeQuery();
			while(rs.next())
			{
				String isbn=rs.getString(1);
				String Bookname=rs.getString(2);
				String authorName=rs.getString(3);
				String edition=rs.getString(4);
				System.out.println("Booking details.....");
				System.out.println("Isbn:"+isbn+"\n BookName:"+Bookname+"\n Edition:"+edition+"\n author name:"+authorName);
				System.exit(0);
			}
			System.out.println("Entered wrong ISBN...!");
			
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occcured"+e);
		}
	}
		public static void Update()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy","root","Mounika@123");
				int Isbn,Edition,rowupdate=0;
				String BookName,AuthorName;
				System.out.println("Enter the ISBN to update");
				Isbn=scan.nextInt();
				System.out.println("Enter the BookName to update");
				BookName=scan.next();
				System.out.println("Enter the authorname to update");
				AuthorName=scan.next();
				System.out.println("Enter the Edition");
				Edition=scan.nextInt();
				
				String sql="update Book set Isbn=?,BookName=?,AuthorName=?,Edition=?";
				PreparedStatement pstmt=con.prepareStatement(sql);
				
				pstmt.setInt(1, Isbn);
				pstmt.setString(2, BookName);
				pstmt.setString(3, AuthorName);
				pstmt.setInt(4, Edition);
				
				rowupdate=pstmt.executeUpdate();
				
				if(rowupdate > 0)
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
		}
			
			public static void Delete()
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy","root","Mounika@123");
					int Isbn,rowdelete=0;
					System.out.println("Enter the ISBN number to delete");
					Isbn=scan.nextInt();
					
					String sql="delete from Book where Isbn=?";
					PreparedStatement pstmt=con.prepareStatement(sql);
					pstmt.setInt(1, Isbn);
					
					rowdelete=pstmt.executeUpdate();
					if(rowdelete > 0)
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
				    
			}
		}
		
	
