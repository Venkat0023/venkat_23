import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

 class FormLargestNo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        Integer a[]=new Integer[n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(a,Collections.reverseOrder());
        String value="";
        for(int i=0;i<a.length;i++)
        {
            value+=a[i];
        }
        System.out.println(value);
    }
}
