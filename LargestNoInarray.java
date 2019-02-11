package com.venkat.kids_player;
import java.util.Arrays;
import java.util.Scanner;


class LargestNoInarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int max=array[0];
        for (int i=1;i<n;i++)
        {
            if (array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
