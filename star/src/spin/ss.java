package spin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ss {
	public static void main(String [] args)
	{
		LocalDateTime orderDate;
		orderDate=LocalDateTime.now();
		System.out.println("orderdate:"+orderDate);
		String fdate=orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("formatted orderdate:"+fdate);
		
	}

}
