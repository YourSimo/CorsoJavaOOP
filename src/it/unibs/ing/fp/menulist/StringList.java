package it.unibs.ing.fp.menulist;

import java.util.Vector;

public class StringList implements MenuList {
	private Vector <String> listaStringhe;

	public StringList() {
		listaStringhe = new Vector <String> ();
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return listaStringhe.isEmpty();
	}

	@Override
	public Object choice(String question) {
		return listaStringhe.get(0);
	}

	@Override
	public void addObject(Object obj) {
		listaStringhe.add((String) obj);
		
	}
}
