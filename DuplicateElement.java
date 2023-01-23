package com.arrayPrograms;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] array = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
	        System.out.println("Duplicate elements in given array: ");  
	      
	        
	        for(int i = 0; i < array.length; i++) {  
	            for(int j = i + 1; j < array.length; j++) {  
	                if(array[i] == array[j])  
	                    System.out.println(array[j]);  
	            }  

	}

	}

}
