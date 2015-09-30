/**
 * Created by Игорь on 30.09.2015.
 */
import java.util.Scanner;
public class Pass {public static void main(String[] args) {
    System.out.println("Enter your name:");
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    scan.close();
    if(name.equals("Igor")){
        System.out.println("Hello " + name);
    }
    else
    {
        System.out.println("Name not found");
    }
}
}
