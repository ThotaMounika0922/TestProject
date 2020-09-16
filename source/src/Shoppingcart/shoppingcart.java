package Shoppingcart;



public class shoppingcart {
	public static void main(String[] args) {
		Item item1 ,item2 ;
		item1=new Item();
		item2=new Item();
		item1.desc="Shirt";
		item1.itemId=121345;
		item2.desc="pants";
		item2.itemId=54321;
		
		System.out.println("Item:"+item1.desc+" " +item1.itemId);
		System.out.println("Item:"+item2.desc+" " +item2.itemId);
		item1=item2;
		System.out.println("Item:"+item1.desc+" " +item1.itemId);
		System.out.println("Item:"+item2.desc+" " +item2.itemId);
		
		
		
		
		
	}
}


