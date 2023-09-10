package com.fedex.springdemo.Algorithms.StringSearch;

public class DuplicateElementsInArray {

    private int giveFirstOccurance(int arr[],int findElement){

        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==findElement){
                result=mid;
                high=mid-1;
            }else if(arr[mid]>findElement){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }

     private int giveLastOccurance(int arr[],int findElement){

        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==findElement){
                result=mid;
                low=mid+1;
            }else if(arr[mid]>findElement){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={1,1,3,3,5,5,5,5,5,9,9,11};
        DuplicateElementsInArray d=new DuplicateElementsInArray();
        int low=d.giveFirstOccurance(arr,3);
        int high=d.giveLastOccurance(arr,3);
        System.out.println((high-low)+1);
    }

}
