package com.cg.framework;

public abstract class SavingAcc extends BankAcc  {
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
		
	}
	private boolean isSalary;
	private static final float MINBAL=1; 
	
	public void withdraw(float accBal)
	{
		System.out.println("Remaining balance after withdraw :"+accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	

}
