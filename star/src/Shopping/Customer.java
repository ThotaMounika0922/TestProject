package Shopping;

public class Customer {
	
	
	private String name;
	private String ssn;

	public Customer(String name,String ssn)
	{
		this.name=name;
		this.ssn=ssn;
				
	}
	public String getName() {
		return name;
		
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	

}
