package com.venkat.hunter;

import java.util.Scanner;

class Reveachword {
    public void revword(String s){
        String[] words=s.split(" ");
        String revstr="";
        for (int i=0;i<words.length;i++){
            String word=words[i];
            String revword="";
            for (int j=word.length()-1;j>=0;j--)
            {
                revword=revword+word.charAt(j);

            }
            revstr=revstr+revword+" ";
        }
        System.out.println(revstr);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scanner.nextLine();
        Reveachword obj = new Reveachword();
        obj.revword(str);

    }
}
