// demostrate arrays
// to find maxium of 6 integers, got from keyboard, and stored in array!

import javax.swing.*;
public class TARR
{
	public static void main(String[] ppp)
	{
		int[] koo = new int[6];

		for(int i=0; i<6; i++)
		{
			String tmp = JOptionPane.showInputDialog("Enter "+(i+1)+" -th integer:");
			koo[i] = Integer.parseInt(tmp);
		}
		// up to here, array koo is filled with 6 integers!
		pa(koo);

		int max = koo[0];
		for(int i=0; i<koo.length; i++)
		{
			if(koo[i]>max)
				max = koo[i];
		}

		System.out.println("Max is "+max);
	}

	/* print out values in an array */
	public static void pa(int[] a)
	{
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+"  ");

		System.out.println();
	}
}