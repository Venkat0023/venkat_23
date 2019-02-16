import java.util.Scanner;
public class NoOfcharWOspc {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        for (int i=0;i<len;i++)
        {
            if(str.charAt(i)==' '){
                continue;
            }
            sum++;
        }
        System.out.println(sum);
    }
}
