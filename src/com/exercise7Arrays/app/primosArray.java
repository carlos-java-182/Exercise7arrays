package com.exercise7Arrays.app;

import java.util.Random;

public class primosArray {

	public static void main(String[] args) {
		
		//Constant declaration
		final int ELEMENTS_ARRAY=100;
		
		//Variable declaration
		byte primeNumbers=0;
		boolean isPrime=true;
		
		//Array declaration
		byte[] vector = new byte[ELEMENTS_ARRAY];
		
		
		//Object declaration
		Random randomNumbers = new Random(System.nanoTime());
		
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			for(int j=2; j<=vector[i]-1; j++)
			{
				if(vector[i]%j==0)
				{
					isPrime=false;
					break;
				}
				
				if(isPrime)
				{
					primeNumbers++;
				}
			}
			
			System.out.println("Quantity of prime numbers is:"+primeNumbers);
		}
		
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			vector[i] = (byte) (randomNumbers.nextInt(15)+1);
			
			System.out.println(vector[i]);
		}
		
			
	}

}
