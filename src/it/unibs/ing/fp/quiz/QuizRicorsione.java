package it.unibs.ing.fp.quiz;

public class Quiz {
	
	public static int square(int n)
	{
	   return square(n,n);
	}
	 
	public static int square(int c, int n) 
	{
	   if (c == 1)
	      return n;
	   else 
	      return square(c-1, n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(square(7));
	}

}
