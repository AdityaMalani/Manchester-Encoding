//Manchester Encoding

import java.util.*;

class Main{
	
	public static void main(String args[]){
	
		String s;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string:");
		s = scn.next();
		
		char[] a = s.toCharArray();
		char[] b = new char[2*(a.length)];
		int i;
		int count = 0;
		for (i=0;i<a.length;i++)
		{
			if (a[i]=='0')
			{
			 b[count++] = '1';
			 b[count++] = '0';
			}
			else{
				 b[count++] = '0';
			 	 b[count++] = '1';
			}
		}
		System.out.println(b);
		System.out.println("Converting the manchester encoded signal back to regular signal...");
		for(i=0;i<b.length;i++)
		{
			if (b[i]=='1')
			{
				System.out.print("0");
				i++;
			}
			else
			{
				System.out.print("1");
				i++;
			}
		}
		System.out.println("");
		
	}
}
