package it.unibs.ing.fp.controlstructures;

public class ControlStructures {
	public static int abs1(int num) {
		if(num >= 0) return num; 
		else return -num;
	}
	
	public static int abs2(int num) {
		return num >= 0 ? num : -num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = new int[6];
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++)
		   {
		      data[i] = i;
		   }
	}

}
