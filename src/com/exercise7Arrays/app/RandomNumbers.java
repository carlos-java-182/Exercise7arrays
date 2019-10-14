package com.exercise7Arrays.app;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		//Constant declaration
		final int ELEMENTS_ARRAY = 10;
		
	
		//Variables declaration
		
		
		double generatednumber=0;
		int generatednumberint=0;
		byte generatednumberbyte=0;
		
		byte evenValues=0;
		byte oddValues=0;
		byte zeroValues=0;
		byte negativeValues=0;
		byte positiveValues=0;
		
		//Arrays declaration
		int[] miArray = new int[ELEMENTS_ARRAY];
		
		byte[] miArray1= new byte[ELEMENTS_ARRAY];
		
		//Array pseudo random numbers
		//Way 1 By means of Random Class
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			generatednumber = randomNumbers.nextDouble();
			System.out.println(generatednumber);
		}
		
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			generatednumberint = randomNumbers.nextInt(10);
			System.out.println(generatednumberint);
		}
		
		
		//Way2 By means of Math Class
		
		for (int i=0; i<ELEMENTS_ARRAY; i++)
		{
			generatednumber = (int) (Math.random()*51+50);
			generatednumberint= (int) generatednumber;
			
			System.out.println (generatednumber);
		}
		
		
		
		//Pass 1 Initialize
		for(int i=0; i<miArray1.length;i++)
		{
			generatednumberint = randomNumbers.nextInt();
			//System.out.println(generatednumberint);
			
			miArray1[i] = generatednumberbyte;
		}
		
		//Pass 2 process
		
			for (int i=0; i<ELEMENTS_ARRAY; i++)
			{
				if(miArray1[i]==0)
				{
					zeroValues++;
				}
				else if(miArray1[i]%2==0)
				{
					evenValues++;
				}
				else if(miArray1[i]%2==1)
				{
					oddValues++;
				}
				else if(miArray1[i]>0)
				{
					positiveValues++;
				}
				else if(miArray1[i]<0)
				{
					negativeValues++;
				}
			}
			
		
		//Pass 3 Visualization
			System.out.println("Zerosquantity:"+zeroValues);
			System.out.println("Odd Values"+oddValues);
			System.out.println("Even Values"+evenValues);
			System.out.println("Positive Values"+positiveValues);
			System.out.println("Negative Values"+negativeValues);
	}

}
