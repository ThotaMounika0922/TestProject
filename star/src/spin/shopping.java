package spin;

public class shopping {
	public static void main(String args[])
	{
			item item1=new item();
		item1.setItemFields("belt", 1, 29.50);
		item1.displayItem();
		int retcode=item1.setItemFields("shirt", 2, 34.99, ' ');
				if(retcode<0) {
					System.out.println("invalid colorcode .Item not added");
				}
				else
				{
					item1.displayItem();
				}
	}

}
