import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("Hello World!");
		System.out.println("What is your name?: ");
		name = in.next();
		System.out.println("Hello " + name);
	}
}
