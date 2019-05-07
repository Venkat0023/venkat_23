import java.util.Scanner;
class Revnum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int rev=0,rem,temp=a;
        while (temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        System.out.println(rev);
    }
}
