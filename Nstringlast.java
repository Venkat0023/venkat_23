import java.util.Scanner;

/**
 * Created by venkat prasad on 1/20/2019.
 */
class Nstringlast {
    public static void main(String[] args) {
        String str,temp="";
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        str=scanner.nextLine();
        System.out.println("Enter the Number");
        n=scanner.nextInt();
        for (int i=n;i<=str.length()-1;i++)
        {
            temp=temp+str.charAt(i);
        }
        System.out.println(temp);
    }
}
                    
