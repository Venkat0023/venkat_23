import java.util.Scanner;
import java.io.*;

class Oddoreven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        if(a<0)
            System.out.println("Invalid");
        else if (a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
