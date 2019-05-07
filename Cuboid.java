import java.util.Scanner;
class Cuboid {
    public static void main(String[] args) {
        int l,b,h,sa,vol;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length,breadth and height");
        l=scanner.nextInt();
        b=scanner.nextInt();
        h=scanner.nextInt();
        sa=2*(l*b)+2*(b*h)+2*(h*l);
        vol=l*b*h;
        System.out.println(sa+"  "+vol);

    }

}
