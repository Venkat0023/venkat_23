import java.util.Scanner;

class Sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int res=0,rem,temp=a;
        while (temp!=0)
        {
            rem=temp%10;
            res=res+rem;
            temp=temp/10;
        }
            System.out.println(res);
    }

}
