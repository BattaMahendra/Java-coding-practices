package com.fedex.springdemo.Algorithms.StringSearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Using HashSet

public class FindPairForGivenSum {

    public static void main(String args[]){
        //Pairs are (4,7) , (5,6)
        //It should be sorted array
        // int[] arr= {1,4,5,7,6,11};
        // int sum=11;
     
        // HashMap<Integer,Integer> st=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
            
        //     int expectedSum=sum-arr[i];

        //     if(st.keySet().contains(expectedSum)){
        //         System.out.println("Found at index "+ i +" and"+st.get(expectedSum));
        //     }else{
        //         st.put(arr[i], i);
        //     }
        // }
        
            //Hash Set

            //int inputArr[]={9,5,14,3,1,15,6};
            int inputArr[]={1,4,5,5,7,6,11};
            //int targetSum=20;
            int targetSum=11;
            Set<Integer> hashSet=new HashSet<>();
            for(Integer ele: inputArr){
                int expectedSecondEle=targetSum-ele;
                if(hashSet.contains(expectedSecondEle)){
                    System.out.println(ele+ " , "+expectedSecondEle);
                }else{
                    hashSet.add(ele);
                }
            }

    }
    
}
