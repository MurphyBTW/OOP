import java.util.PriorityQueue;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        PriorityQueue<String> nicknames = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nicknames of 4 of your classmates:");
        for (int i = 0; i < 4; i++) {
            String nickname = scanner.nextLine();
            nicknames.add(nickname);
        }

        System.out.println("Press H to say Hi to each of them.");
        while (!nicknames.isEmpty()) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("H")) {
                String currentNickname = nicknames.poll();
                System.out.println("Hi " + currentNickname);
            }
        }
        
        System.out.println("Done saying Hi");
        
        scanner.close();
    }
}
