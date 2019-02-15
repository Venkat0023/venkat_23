
import java.util.Arrays;
import java.util.Scanner;

class FindRepeatedno {
    public static void main(String[] args) {
        int v=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the N");
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        for(int j=0;j<n;j++)
        {
            for (int k=j+1;k<n;k++)
            {
                if (a[j]==a[k])
                {
                    v=1;
                    System.out.println(a[j]+" ");
                }
            }
        }
        if (v==0)
        {
            System.out.println("unique");
        }
    }
}
