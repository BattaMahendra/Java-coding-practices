package com.fedex.springdemo.Interview;

import java.util.Stack;

public class PrefixOperand {
    public static void main(String[] args) {
        String exprsn = "-+*9234";
        System.out.println(evaluatePrefix(exprsn));
    }

    private static double evaluatePrefix(String exprsn) {
        Stack<Integer> st=new Stack<>();
        for(int i=exprsn.length()-1;i>=0;i--){
            if(exprsn.charAt(i)=='+'){
                int res1=(Integer)st.pop();
                int res2=(Integer)st.pop();
                int res=res1+res2;
                st.push(res);
            }
            else if(exprsn.charAt(i)=='-'){
                int res1=(Integer)st.pop();
                int res2=(Integer)st.pop();
                int res=res1-res2;
                st.push(res);
            }
            else if(exprsn.charAt(i)=='*'){
                int res1=(Integer)st.pop();
                int res2=(Integer)st.pop();
                int res=res1*res2;
                st.push(res);
            }
            else if(exprsn.charAt(i)=='/'){
                int res1=(Integer)st.pop();
                int res2=(Integer)st.pop();
                int res=res1/res2;
                st.push(res);
            }else{
                System.out.println(exprsn.charAt(i));
                st.push(Character.getNumericValue(exprsn.charAt(i)));
            }
        }
        return (Integer)st.pop();
    }
}
