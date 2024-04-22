import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Numbers quantity: ");
            int quantity = read.nextInt();
            int [] numbers = new int[quantity];
            for (int i = 0; i < quantity; i++) {
                System.out.print("Number: ");
                int x = read.nextInt();
                numbers[i] = x;
            }
            Arrays.sort(numbers);
            while (true){
                int sum = 0;
                for (int i = 0; i < quantity - 1; i++) {
                    sum = sum + (numbers[i+1] - numbers[i]);
                }
                if (sum % 2 == 0 && sum != 0){
                    System.out.println("Sum even: " + sum);
                    System.out.println("Longest length: " + quantity);
                    break;
                } else if (quantity == 1){
                    System.out.println("Don't have sum of diff of adjacent even.");
                    break;
                } else {
                    quantity = quantity - 1;
                    System.out.println("quantity: " + quantity);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Only enter numbers");
        }
    }
}
