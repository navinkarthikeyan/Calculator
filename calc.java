import java.util.Scanner;

public class calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System. in);
        System.out.println("You Want To Perfrom add or sub or mult or div: ");
        String j = sc.nextLine();
        if (j.equals("add")) {
            int sum_a   = sc.nextInt();
            int sum_b = sc.nextInt();
            int sum_c = sum_a + sum_b ;
            System.out.println(sum_c);
        } else if (j.equals("sub")) {
            int sub_a = sc.nextInt();
            int sub_b = sc.nextInt();
            int sub_c = sub_a - sub_b;
            System.out.print(sub_c);
        } else if (j.equals("mult"))
        {
            int mult_a = sc.nextInt();
            int mult_b = sc.nextInt();
            int mult_c = mult_a * mult_b;
            System.out.print(mult_c); 
        } else if (j.equals("div"))
        { 
            int div_a = sc.nextInt();
            int div_b = sc.nextInt();
            int div_c = div_a / div_b ;
            System.out.print(div_c);
        }
         else {
            System.out.print("Not Valid");
        }
        sc.close();
    }
}