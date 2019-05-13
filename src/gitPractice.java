import java.util.*;
public class gitPractice {
    public static void main(String args[]) {
        Scanner in = new Scanner( System.in );
        System.out.print("What is your name?");
        String name = in.next();
        StringBuilder amen = new StringBuilder();
        for (char c: name.toCharArray()) {
            amen.append(c);
            amen.reverse();
        }
        System.out.print(amen);
    }
}
