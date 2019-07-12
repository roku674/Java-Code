
// test Math class
public class TMATH
{
	public static void main(String[] args)
	{
		double x = 0;

		for(int i=1; i<=100; i++)
		{
			x = Math.random();
			double y = 10*x; // real number between 0.0 and 10.0, but 10.0 not included
			int z = (int)y;  // integer between 0 and 9
			z = z+1; // Random integer between 1 and 10
			System.out.println(z);
		}
	}
}