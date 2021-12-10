package com.apnacollege;

public class totalCharacters {
    public static void main(String []args){
        String s="The best of both worlds";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=' ' ){
                c++;
            }
        }
        System.out.println("total characters--> "+c);
    }
}
