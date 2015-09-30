/**
 * Created by IT_School on 26.09.2015.
 */
import java.util.Scanner;
public class RunScaner {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello  " + name);
        scan.close();
    }
}
