package com.guddi;

public class PrimeNumber {

	//
	
	
	public boolean Prime(int num) {
		
		if(num==1 || num==2) {
			return true;
		}
		for(int i=3;i<num/2;i++) {
			if(num%i==0)
				return false;			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		PrimeNumber primeNumber=new PrimeNumber();
		System.out.println(primeNumber.Prime(7));		
	}

}
