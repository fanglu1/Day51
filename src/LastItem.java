import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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
        System.out.println("The last item in the list is: " + (list.get(list.size()-1)));
    }
}
