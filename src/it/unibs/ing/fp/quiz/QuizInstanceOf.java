package it.unibs.ing.fp.quiz;


public class QuizInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rettangolo r = new Rettangolo(0, 0, 5, 7);
		String s = r.toString();
		String t = new String();
		t = r.toString();
		if (s instanceof Rettangolo) System.out.println(s);
		if(t instanceof Rettangolo);
	}

}
