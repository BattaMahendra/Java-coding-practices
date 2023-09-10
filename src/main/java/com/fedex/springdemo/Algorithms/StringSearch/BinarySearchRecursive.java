package com.fedex.springdemo.Algorithms.StringSearch;

public class BinarySearchRecursive {

    private int findIndexOfEle(int arr[],int key,int high,int low){
        
        int mid=(low+high)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid]==key){
          int finalIndex=mid;
          return finalIndex;
        }else if(arr[mid]>key){
            high=mid-1;
            return findIndexOfEle(arr, key, high, low);
        }else{
            low=mid+1;
            return findIndexOfEle(arr, key, high, low);
        }
      
    }
    public static void main(String args[]){
        int arr[]={-4,-1,3,7,10,11};
        int findEle=11;
        int show=-1;
        BinarySearchRecursive b=new BinarySearchRecursive();
        show=b.findIndexOfEle(arr,findEle,arr.length-1,0);
        System.out.println(show);
    }
}
