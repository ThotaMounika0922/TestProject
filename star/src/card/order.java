package card;

public class order {
	
	
	
	private String name;
	private double total;
	private String statecode;
	  private char custType;
	static final char NONPROFIT='N';
 double discount;
static final char PRIVATE='P';

	

	public order
	(String name,double total,String state,char custType)
	{
		this.name=name;
		this.total=total;
		this.statecode=state;
		this.custType=custType;
		calcDiscount();
		
	}
	
	
	

	public  String getDiscount( ) {
		return Double.toString(discount)+" % ";
	}
	private void calcDiscount() {
		// TODO Auto-generated method stub
		if(custType==NONPROFIT) {
			if(total>900)
			{
				discount=10.00;
				
			}
			else
			{
				discount=5.00;
			}
		}
			else if(custType==PRIVATE)
			{
				if(total>900) {
				discount=7.00;
				
				
			}
			else discount=0;
			
		}
	}
	
	



	

}
