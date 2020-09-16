package Shopping;

public class Testclass {
	public static void main(String [] args)
	{
		int x=9,y=3;
		if(x/y<3) {
			x+=y;
			
		}
		else
		{
			x*=y;
			
		}
		System.out.println("after if statement"+x);
		x=9;
		y=3;
		x=((x/y)<3)?(x+=y):(x*=y);
		System.out.println("after ternary operations:"+x);
	}
}
