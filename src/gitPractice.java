import java.util.*;

public class gitPractice {
    public static void main(String args[]) {
        Scanner in = new Scanner( System.in );
        System.out.println("What is your name?");
        String name = in.nextLine();
        StringBuilder amen = new StringBuilder();
        char[] h = name.toCharArray();
        for (int i = 0; i < h.length; i++) {
            amen.append(h[i]); 
        }
        amen.reverse();
        System.out.print(amen);
    }
}

