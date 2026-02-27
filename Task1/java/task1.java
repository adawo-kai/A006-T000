// Task 1
//new version
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            return;
        }

        String commands = sc.nextLine().trim();
        int position = 0;

        for (int i = 0; i < commands.length(); i++) {
            char c = commands.charAt(i);
            if (c == 'L') {
                position -= 1;
            } else if (c == 'R') {
                position += 1;
            }
        }

        System.out.println(position);
    }
}
