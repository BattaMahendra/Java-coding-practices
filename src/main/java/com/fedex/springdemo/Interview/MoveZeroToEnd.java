package com.fedex.springdemo.Interview;


public class MoveZeroToEnd {

	public static void main(String[] args) {
		int arr[]= {8,5,0,10,0,20};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				int temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
