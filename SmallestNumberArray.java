package com.arrayPrograms;

public class SmallestNumberArray {

	public static void main(String[] args) {
		
		int [] array = new int [] {25, 35, 75, 5, 55};  
	      
        int minimum = array[0];  
      
        for (int i = 0; i < array.length; i++) {  
          
           if(array[i] <minimum)  
        	   minimum = array[i];  
        }  
        System.out.println("Smallest element present in given array: " + minimum);  

	}

}
