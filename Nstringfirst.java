import java.util.Scanner;


 class Nstringfirst {
    public static void main(String[] args) {
        String str,temp="";
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        str=scanner.nextLine();
        System.out.println("Enter the Number");
        n=scanner.nextInt();
        for (int i=0;i<=n-1;i++)
        {
            temp=temp+str.charAt(i);
        }
        System.out.println(temp);
    }
}
