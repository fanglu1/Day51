import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Please enter at least 5 words. Press enter again after the 5th word or the last word you input.");
        while (true) {
            String userInput = input.nextLine();
            if (userInput.equals("")) {
                break;
            } else {
                list.add(userInput);
            }
        }
        System.out.println("The fifth item in the list is: " + list.get(4));
    }
}
