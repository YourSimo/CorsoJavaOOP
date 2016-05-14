package it.unibs.ing.fp.strings;

public class Strings {

   public static void main(String args[]){
      String str1 = new String("0123456");

      System.out.print("String Length :");
      System.out.println(str1.length());
      
      String [] players = {"Harry", "Sally", "Jeremy", "Cameron"};
      for (String p: players)
         // process each player;
      System.out.println("The last player is: " + p);
      
      int x = Integer.parseInt("1234");
      System.out.println(x);
      
      double y = 32.0;
      
      String msg = String.format("%1.2f", y);
      System.out.println(msg);
      
      String helloIta = new String("Ciao");
      String helloIta1 = new String("Ciao");
      
      if(helloIta.equals(helloIta1)) System.out.println("CIAO");;
      
      System.out.println(helloIta.substring(1,4)); // Begin [1] remove, End [4] leave;
   }
}
