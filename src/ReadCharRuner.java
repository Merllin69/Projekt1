import java.io.IOException;

/**
 * Created by IT_School on 26.09.2015.
 */
public class ReadCharRuner {
    public static void main(String[] args) throws IOException {
        int x;
        x= System.in.read();
        char c = (char)x;
        System.out.println("??? ???????:" +c+"="+x);

    }
}
