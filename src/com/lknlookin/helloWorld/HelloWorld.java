package com.lknlookin.helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		//1
		int[][] arr2d = {{1,2,3,4},{5,6,7,8}};
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}
		
		//2
		int sum=0;
		for (int i = 0; i < arr2d.length; i++) {
			sum += arr2d[i][arr2d[i].length-1];
		}
		System.out.println(sum);
	}
	
}
