import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Please enter as many words as you like. Press enter again after the last word you input.");
        while (true) {
            String userInput = input.nextLine();
            if (userInput.equals("")) {
                break;
            } else {
                list.add(userInput);
            }
        }
        System.out.println("The total amount of items in the list was: " + list.size());
    }
}
