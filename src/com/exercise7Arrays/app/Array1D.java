package com.exercise7Arrays.app;

public class Array1D {

	public static void main(String[] args) {
		
		//Arrays declaration
		
		//Constant declaration
		final int ELEMENTS_ARRAY = 10;
		//1 Way
		int[] intArray = new int[ELEMENTS_ARRAY];
		char[] charArray = new char[ELEMENTS_ARRAY];
		boolean[] boolArray = new boolean[ELEMENTS_ARRAY];
		double[] dblArray = new double[ELEMENTS_ARRAY];
		String[] strArray = new String[ELEMENTS_ARRAY];
		
		
		int[] intArray2 = {10, 20, 30, 40, 50, 60};
		char[] charArray2 = {'a','b','c','d','e'};
		boolean[] boolArray2 = {true, false, true, false, true,};
		double[] dblArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] strArray2 = {"first", "second", "thrid", "fourth","fifth"};
		
		for(int i=0;i<ELEMENTS_ARRAY; i++)
		{
			System.out.println(strArray2[i]);
		}

		for(int i=0; i<intArray2.length;i++)
		{
			System.out.println(intArray2[i]);
		}
		
		for(int i=0; i<charArray2.length;i++)
		{
			System.out.println(charArray2[i]);
		}
		
		for(int i=0; i<boolArray2.length;i++)
		{
			System.out.println(boolArray2[i]);
		}
		
		for(int i=0; i<dblArray2.length;i++)
		{
			System.out.println(dblArray2[i]);
		}
		
		
		for(int i=0; i<strArray2.length;i++)
		{
			System.out.println(strArray2[i]);
		}
		
	
	}
}
