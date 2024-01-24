package com.Linus;
import java.util.Date;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		// primitive variables 
		byte favNum = 17;
		long viewers = 8643555435L;
		double balance = 0.99;
		float cents = 10.498F;
		boolean isgreater = true;
		System.out.println (favNum);
		System.out.println (viewers);
		System.out.println (balance);
		System.out.println (cents);
		System.out.println (isgreater);		
		//reference types variables
		Date now = new Date();
		System.out.println(now); 
		// declaring and outputing arrays
		int[] len = {243, 23, 34543, 434, 51434 };
		//for(int i : len)
		for(int i=1;i<=len.length;i++)
		
		// System.out.println(len[0]);
		System.out.println(len[i]);
				

	}

}

