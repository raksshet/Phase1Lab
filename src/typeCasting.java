
public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a ='A';
		System.out.println("The value of a "+a);
		int i=a;
		System.out.println("The value of i "+i);
		float f=a;
		System.out.println("the value of f "+f);
		double d=a;
		System.out.println("The value of d "+d);
		
		//Explicit conersion
		
		
		
		char s='C';
		System.out.println("The value of s "+s);
		int i2= (int) s;
		System.out.println("The value of i2 "+i2);
		double e=80.80;
		System.out.println("The value of e "+e);
		int y = (int) e;
		System.out.println("The value of y "+y);
		
		
		int i3=68;
		char h= (char)i3;
		System.out.println("The value of y "+h);
		
		
	}

}
