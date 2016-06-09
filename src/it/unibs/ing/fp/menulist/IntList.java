package it.unibs.ing.fp.menulist;

import java.util.Vector;

public class IntList implements MenuList {
	private Vector <Integer> listaInt;

	public IntList() {
		listaInt = new Vector <Integer> ();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return listaInt.isEmpty();
	}

	@Override
	public void addObject(Object obj) {
		// TODO Auto-generated method stub
		try {
			listaInt.add((Integer) obj);
		}
		catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public Object choice(String question) {
		// TODO Auto-generated method stub
		return listaInt.get(0);
	}

}
