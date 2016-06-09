package it.unibs.ing.fp.menulist;

public class Main {
	private static StringList myListStringhe = new StringList();
	private static IntList myListInteri = new IntList();
	private static DoubleList myListDouble = new DoubleList();
	private static MenuList myListMenu = new IntList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility.doSomething(myListStringhe, "Scelta");
		Utility.doSomething(myListInteri, "Scelta");
		Utility.doSomething(myListMenu, "Scelta");
		
		myListStringhe.addObject("Ciao");
		myListInteri.addObject(4);
		myListDouble.addObject(8.0);
		myListMenu.addObject("5");	//	Exception
		
		Utility.doSomething(myListStringhe, "Scelta");
		Utility.doSomething(myListInteri, "Scelta");
		Utility.doSomething(myListMenu, "Scelta");
		
		//	myListInteri.addObject("7"); Exception
		
		
	}

}
