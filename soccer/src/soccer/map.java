package soccer;

public class map {
	

	public static void main(String[] args)
	{
		String CustName="mahi";
		String itemDesc="Shirt";
		double price=21.99;
		int quantity =2;
		double tax=104;
		double total;
		boolean stockstatus;
		String Message=CustName+"wants to purchase"+quantity+""+itemDesc;
		total=(price+quantity)*tax;
		if(quantity>1)
		{
			Message=Message+"s";
		System.out.println(Message);
		System.out.println("Total cost with tax:"+total);
		
			
			}
	}

}
