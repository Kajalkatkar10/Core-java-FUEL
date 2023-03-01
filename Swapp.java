//Swapping of two numbers(using 3rd variable and not using 3rd variable)
//WAP where number is even or odd
//WAP table of given number
public class Swapp{
	public static void main(String args[]){
		System.out.println(" Before swapping");
		int a=10;
		int b=20;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		System.out.println(" After swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a " +a);
		System.out.println("value of b "+b);
	}
}