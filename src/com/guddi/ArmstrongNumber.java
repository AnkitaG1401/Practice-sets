package com.guddi;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber=new ArmstrongNumber();
		armstrongNumber.checkArmstrongNumber(153);
	}
		
	public void checkArmstrongNumber(int num) {
		
		int i,newNum=0,a=num;
		while(num>0) {
			i=num%10;
			newNum=newNum+(i*i*i);
			num=num/10;
		}
		if(a==newNum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong number");
	}
}
