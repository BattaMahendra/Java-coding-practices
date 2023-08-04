package com.fedex.springdemo.Interview;

public class DeleteElementFromArray {
	
	public static void main(String args[]) {
		int arr[]= {4,5,9,7,3};
		int ele=3;
		int i=0;
		int count=0;
		for (i=0; i < arr.length; i++) {
			count++;
			if(arr[i]==ele) {
			break;
			}
		}	
		for (int j=i; j< arr.length-1; j++) {
			count++;
			arr[j]=arr[j+1];
		}
		System.out.println("Count"+count);
		
		for (int k = 0; k < arr.length-1; k++) {
			System.out.println(arr[k]);
		}
	}


}
