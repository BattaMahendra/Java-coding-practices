package com.fedex.springdemo.Algorithms.StringSearch;

public class BinarySearchRotatedArray {
    public static void main(String args[]){
        int arr[]={7,8,0,1,2,3,4,5,6};
        int findEle=5;
        int left=0;
        int right=arr.length-1;
        //int mid=0;
        int finalIndex=-1;
        //We have to go for complete sorted half

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==findEle){
                finalIndex=mid;
                break;
            }else if(arr[left]>arr[mid]){
                //right sorted
                if(findEle>=arr[mid] && findEle<arr[right])
                    left=mid+1;                   
                else
                    right=mid-1;
                    
            }else{
                //left sorted half
                if(findEle>=arr[left] && findEle<=arr[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        System.out.println("Element found at index "+finalIndex);
    }
}
