package com.arrayPrograms;

public class AverageOfArray {

	public static void main(String[] args) {


		int[] array = { 10,20,30,40,50 };
		  
        int length = array.length;
        int sum = 0;
        
        System.out.println("Length of array : "+length);
        
        for(int i = 0; i <  array.length ; i++) {
            sum = + array[i];   // sum= sum + array[i]
        }
 
        int average = sum / length;
         
        System.out.println("Average of array : "+average);
 
   }
}
