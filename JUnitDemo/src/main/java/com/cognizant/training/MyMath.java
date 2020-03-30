package com.cognizant.training;

public class MyMath {
	
	
	public boolean isEven(int i){
		
		boolean isEven = false;
		int reminder = i%2;
		
		if(reminder==0) {
			
			isEven = true;
		}
		
		return isEven;
	}
	
	
	
	public int findAbsolute(int i) {
		
		int result = Math.abs(i);
		
		return result;
		
		
	}

}
