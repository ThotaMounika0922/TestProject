package SOUCE1;

public class Shoppingcart {
	public static void main(String[] args) {
		String CustName="mounu indy";
		String firstName;
		int spaceIndex;
		StringBuilder sb;
		
		spaceIndex=CustName.indexOf(" ");
		firstName=CustName.substring(0,spaceIndex);
		System.out.println(firstName);
		sb=new StringBuilder(firstName);
		System.out.println(sb);
		sb.append("indy");
		System.out.println(sb);
		
		
	}

}
