import java.util.Scanner;

class Strpalin {
    public static void main(String[] args) {
        String str,rev="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        str=scanner.nextLine();
        for (int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("yes");
        else
            System.out.println("no");

    }
}