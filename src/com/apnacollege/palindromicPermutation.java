package com.apnacollege;
import java.util.* ;
public class palindromicPermutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System .in );
        System.out.println("enter string");
        String s1 =s.nextLine()  ;
        int a=0,b=0,c=0;
        for(int i=0;i<s1.length() ;i++){
            for(int j=i+1;j<s1.length() ;j++){
                if(s1.charAt(i) ==s1.charAt(j)){
                    a++;
                }else
                    b++;
            }
        }
        if(a >=2 && b >=2){
            System.out.println("YES");// your code here
        }else
            System.out.println("NO");
    }
}
