package com.fedex.springdemo.Interview;

public class LargestElement {
	public static void main(String args[]) {
//		int arr[]= {4,5,9,7,3};
//		int largestele=arr[0];
//		int index=0;
//		for (int i=0; i < arr.length; i++) {
//			
//			if(largestele>arr[i]) {
//				continue;
//			}else {
//				largestele=arr[i];
//				index=i;
//			}
//		}	
//		
//		System.out.println("Max Element and index "+largestele+"  "+index);
//		
//		//less space complexity
//		int res=0;
//		for (int i=0; i < arr.length; i++) {
//			
//			if(arr[i]>arr[res]) {
//				res=i;
//			}
//		}	
//		
//		System.out.println("Max Element and index "+arr[res]+"  "+res);
		
		//Second Largest
		int arr1[]= {4,5,9,7,3};
		int largestelement,secondLargest;
		largestelement=secondLargest=-1;
		System.out.println(Integer.MIN_VALUE);
		for (int i=0; i < arr1.length; i++) {
			if(arr1[i]>largestelement) {
				secondLargest=largestelement;
				largestelement=arr1[i];
				continue;
			}
			if(arr1[i]>secondLargest && arr1[i]!=largestelement) {
				secondLargest=arr1[i];
			}
		}
		System.out.println(secondLargest);

	}

}
