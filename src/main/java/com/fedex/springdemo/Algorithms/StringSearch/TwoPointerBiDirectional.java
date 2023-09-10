package com.fedex.springdemo.Algorithms.StringSearch;


//Find pair from a integer array which is equal to given sum
//Input should be sorted array.
public class TwoPointerBiDirectional {

    public static void main(String args[]){
        int arr[]={-3,2,3,3,6,8,15};
        int targetSum=6;
        //two pointers
        int start=0;
        int end=arr.length-1;
        int result[]=new int[2];
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum>targetSum){
                end--;
            }else if(sum<targetSum){
                start++;
            }else{
                result[0]=start;
                result[1]=end;
                break;
            }
        }
        System.out.println(result[0]+", "+result[1]);
    }
    
}
