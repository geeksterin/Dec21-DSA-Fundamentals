package com.twodarrays;

public class NormalIteration {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,10},{4,5,6,10},{7,8,9,10}};
		
		for(int i=0; i<arr.length ;i++) {
			
			int row = i;
			
			for(int j = 0; j<arr[i].length; j++) {
								
				System.out.print(arr[row][j] +" ");
	
			}
			System.out.println();
			
			
		}
		
	}

}
