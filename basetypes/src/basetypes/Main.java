package basetypes;

public class Main 
{
	public static void main(String arg[])
	{
		int a = 2;
		int b = 1;
		double ba = 11.5;

		double result = ba / a;
		System.out.println(result);

		System.out.println(b + a);

		System.out.println(b / a);

		System.out.println(b % a);

		String sa = "Lambda";
		String sb = "School";

		String ans = sa + sb;
		System.out.println(ans);

		a += b;

		System.out.println(a);

		b++;
		System.out.println(b);
	}
}