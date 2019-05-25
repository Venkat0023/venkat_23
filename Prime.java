import java.util.Scanner;
 class Prime {
    public static void main(String[] args) {
        int temp;
        boolean isprime=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        for (int i=2;i<=n/2;i++)
        {
            temp=n%2;
            if(temp==0)
            {
                isprime=false;
            }
        }
        if (isprime)
        {
            System.out.println("The given number is prime");
        }
        else
        {
            System.out.println("The given number is not prime");
        }
    }
}
