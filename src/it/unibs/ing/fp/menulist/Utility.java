package it.unibs.ing.fp.menulist;

public class Utility {
	public static void doSomething(MenuList menulist, String question) {
		if(menulist.isEmpty()) System.out.println("VUOTA!");
		else System.out.println(menulist.choice(question));
	}
	
	public static void newObject(MenuList menulist) {
		menulist.addObject(new Object());
	}

}
