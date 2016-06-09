package it.unibs.ing.fp.menulist;

import java.util.Vector;

public class DoubleList extends ListLib {
	private Vector <Double> listaDouble;

	public DoubleList() {
		listaDouble = new Vector <Double> ();
	}
	
	@Override
	public void addObject(Object obj) {
		// TODO Auto-generated method stub
		listaDouble.add((Double) obj);
		
	}

}
