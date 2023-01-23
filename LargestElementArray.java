package com.arrayPrograms;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int [] arr = new int [] {25, 18, 77, 85, 46};  
	     
        int max = arr[0];  
       
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  

	}

}
