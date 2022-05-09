import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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
        int sum = 0;
        for (int i = 0; i <= list.size()-1; i++) {
            sum += list.get(i);
        }
        System.out.println(list + " were the items in the list. The sum of the numbers is: " + sum);
    }
}