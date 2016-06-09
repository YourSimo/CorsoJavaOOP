package it.unibs.ing.fp.quiz;

public class QuizRicorsione {
	
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
	
	public static void myPrint2(int n) 
	{
	   if (n < 10)
	      System.out.print(n);
	   else 
	   {
	      myPrint2(n/10);
	      int m = n % 10;
	      System.out.print(m);
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(square(7));
		myPrint2(345);
	}

}
