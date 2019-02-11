package com.venkat.kids_player;

import java.util.Scanner;

class SumofAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N,A,D values");
        int n= scanner.nextInt();
        int a= scanner.nextInt();
        int d= scanner.nextInt();
        int result;
        result=((n)*(2*a+(n-1)*d))/2;
        System.out.println(result);

    }
}
