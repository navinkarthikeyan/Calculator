import java.util.Scanner;

public class jaba {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System. in);
        System.out.println("You want to add or sub: ");
        String j = sc.nextLine();
        if (j.equals("add")) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;
            System.out.println(c);
        } else if (j.equals("sub")) {
            int q = sc.nextInt();
            int w = sc.nextInt();
            int r = q - w;
            System.out.print(r);
        } else {
            System.out.print("Not Valid");
        }
        sc.close();
    }
}