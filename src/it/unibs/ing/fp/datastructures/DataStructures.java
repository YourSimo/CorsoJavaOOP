package it.unibs.ing.fp.datastructures;

import java.util.LinkedList;

public class DataStructures {

	public static void main(String[] args) {
		LinkedList <String> listaConcatenata = new LinkedList <> ();
		listaConcatenata.addFirst("3");
		listaConcatenata.addFirst("2");
		listaConcatenata.addLast("4");
		listaConcatenata.addFirst("1");
		System.out.println(listaConcatenata);
		System.out.println(listaConcatenata.removeLast());
		System.out.println(listaConcatenata.removeFirst());
		System.out.println(listaConcatenata);
	}

}
