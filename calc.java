import java.util.Scanner;

public class calc {
    public static void main(String args[]) {
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while (cont == true){
            System.out.println("You Want To Perfrom add or sub or mult or div: ");
            String j = sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (j.equals("add")) {
                int c = a+b;
                System.out.println(c);
            } else if (j.equals("sub")) {
                int c = a-b;
                System.out.println(c);
            } else if (j.equals("mult")) {
                int c = a*b;
                System.out.println(c);
            } else if (j.equals("div")) {
                int c = a/b;
                System.out.println(c);
            } else {
                System.out.println("Not Valid");
            }
            System.out.println("Do you want to continue?");
            String c = sc.nextLine();
            c = sc.nextLine(); 
            System.out.println(c);
            if (c.equals("yes")){
                cont = true;
            } else {
                cont = false;
                System.out.println("gg");
            }
        }

    }
}