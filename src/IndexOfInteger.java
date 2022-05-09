import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Please enter as many numbers as you like. Press 0 and enter again after the last number you input.");
        while (true) {
            int userInput = input.nextInt();
            if (userInput == 0) {
                System.out.println("Done entering integers into the list.");
                break;
            } else {
                list.add(userInput);
            }
        }
        System.out.println("What number are you looking for in this list?");
        int numInput = input.nextInt();
        for (int i = 0; i <= (list.size()-1); i++) {
            if (list.get(i) == numInput) {
                System.out.println(numInput + " is the index of " + i);
            }
        }
    }
}