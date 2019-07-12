
// test Math class
public class TRD
{
	public static void main(String[] args)
	{
		String output = "";

		for(int i=1; i<=20; i++)
		{
			int z = 1 + (int)(6*Math.random());
			output = output+z+"   ";
			if(i%5==0)
				output = output+"\n";
		}


		System.out.println(output);
	}
}