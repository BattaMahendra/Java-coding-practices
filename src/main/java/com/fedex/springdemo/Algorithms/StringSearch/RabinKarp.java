package com.fedex.springdemo.Algorithms.StringSearch;

public class RabinKarp {

    public static void main(String args[]){
        // String text="aaaab";
        // String pattern="aab";
        String text="cxyzghxyzvjkxyz";
        String pattern="xyz";
        int q=101;
        searchPattern(text,pattern,q);
    }

    private static void searchPattern(String text, String pattern, int q) {
        int multiplier=256;
        int m=pattern.length();
        int n=text.length();
        int p=0;
        int t=0;
        int h=1;
        //Maximum multiplier
        //if pattern is aab then h=256^2 if pattern is ccdb then h=256^3
        for(int i=0;i<m-1;i++){
            h=(h*multiplier)%q;
        }
        //hashcode of pattern and hashcode of first substring of text
        //aab
        //p=1
        //257
        //257*256+2
        //(256+1)*256+2
        for(int i=0;i<m;i++){
            p=(p*multiplier+pattern.charAt(i))%q;
            t=(t*multiplier+text.charAt(i))%q;
        }

        //Iterate over the entire text 
        //Also iterate over the pattern and first substring to match char by char if 
        //the has code of pattern and first sub string is same.
        for(int i=0;i<=n-m;i++){
            if(t==p){
                int j;
                for(j=0;j<m;j++){
                    if(pattern.charAt(j)!=text.charAt(i+j)){
                        break;
                    }
                }
                if(j==m){
                    System.out.println("Pattern is matched at index "+i);
                }
            }
            if(i<n-m){
                t=(multiplier*(t-text.charAt(i)*h)+text.charAt(i+m))%q;
                if(t<0)
                t=t+q;
            }
            
        }

    }
    
}
