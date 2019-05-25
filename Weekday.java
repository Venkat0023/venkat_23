import java.util.Scanner;
class Weekday {
    public static void main(String[] args) {
        String s1,s2,s3;
        s1="Saturday";
        s2="Sunday";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day");
        s3=scanner.next();
        if(s3.equals(s2)||s3.equals(s1)){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
