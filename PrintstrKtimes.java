import java.util.Scanner;
class PrintstrKtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter Number of times the strings to be printed");
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            System.out.println(str);
        }
    }
}
