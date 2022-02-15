package Q1bubbleSortArray1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,0,5,6,3,2,3,7,9,8,4};
	   	boolean sorted = false; 
	   	int temp; 
	   	while(!sorted) { 
	   	sorted = true; 
	   	for (int i = 0; i < array.length - 1; i++) { 
	   	   if (array[i] > array[i+1]) { 
	   	   temp = array[i]; 
	   	   array[i] = array[i+1]; 
	   	   array[i+1] = temp; 
	   	   sorted = false; 
	   	} 
	   	
	   }
	  } 
	   	System.out.println(Arrays.toString(array));
  }

}

