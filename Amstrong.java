import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int res=0,rem,temp=a;
        while (temp!=0)
        {
             rem=temp%10;
             res=res+rem*rem*rem;
             temp=temp/10;
        }
        if(res==a)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
