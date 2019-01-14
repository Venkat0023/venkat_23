import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int a= scanner.nextInt();
      if(a==0)
          System.out.println("Zero");
      else if (a<0)
          System.out.println("Negative");
      else
          System.out.println("Positive");

    }
}
