package com.fedex.springdemo.Algorithms.StringSearch;

//Given Integer array and sub array size k. find the Maximum sum of any contiguous sub array size k.
public class TwoPointersUniDirectional {
    public static void main(String args[]){
        int arr[]={1,9,-1,-2,7,3,-1,2};
        int k=4;
        int start=0;
        int end=0;
        int maxsum=0;
        int windowsum=0;
        while(end<k){
            windowsum+=arr[end];
            end++;
        }
        
        while(end<arr.length){
            windowsum+=arr[end++ ]-arr[start++];
            maxsum=Math.max(windowsum, maxsum);
        }
        System.out.println(maxsum);
    }
}
