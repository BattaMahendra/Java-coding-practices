package com.fedex.springdemo.Algorithms.StringSearch;

public class BinarySearch {
    public static void main(String args[]){
        int arr[]={-4,-1,3,7,10,11};
        int findEle=10;

        int low=0;
        int high=arr.length-1;
        //int mid=0;
        int finalIndex=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==findEle){
                finalIndex=mid;
                break;
            }else if(arr[mid]>findEle){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("Element found at index "+finalIndex);
    }
    
}
