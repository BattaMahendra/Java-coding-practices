package com.fedex.springdemo.Interview;

public class TwoDArray {
	public static void main(String[] args) {
		int arr[][]=new int[3][4];
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j]=(int)(Math.random()*10);
			}
		}
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int[] is : arr) {
			for (int m : is) {
				System.out.print(m+" ");
			}
			System.out.println("");
		}
		//Jagged Array
	}
}
