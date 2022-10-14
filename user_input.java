import java.util.Scanner;

/**
 * user_input
 */
public class user_input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = s.nextLine();
        System.out.println("How old are you:");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("What is your Country:");
        String cou = s.nextLine();
        System.out.println("Hello,My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My country is"+" "+cou);

        s.close();

    }
}