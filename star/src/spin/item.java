package spin;

public class item {
	private int quantity;
	private double price;
	private char colorcode;
	private String desc;
	public void displayItem()
	{
		
		System.out.println("Item:"+desc+ " ,"+quantity+" ,"+price+","+colorcode);
		
	}
	public void setItemFields(String desc,int qty,double pr) {
		
		this.desc=desc;
		this.quantity=qty;
		this.price=pr;
		
	}
	public int  setItemFields(String desc,int qty,double pr,char c) {
		if(c!=' ') {
			colorcode= c;
			this.setItemFields(desc, qty, pr);
			return 1;
		}
		else 
			return -1;
			
		}
	}
	


