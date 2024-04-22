import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("samDaily = ");
            int samDaily = read.nextInt();
            System.out.print("kellyDaily = ");
            int kellyDaily = read.nextInt();
            System.out.print("difference = ");
            int difference = read.nextInt();
            int count = 1;
            int samSolved = samDaily + difference;
            int kellySolved = kellyDaily;
            while(kellySolved <= samSolved){
                samSolved = samSolved + samDaily;
                kellySolved = kellySolved + kellyDaily;
                count++;
            }
            System.out.println(count);
        } catch (InputMismatchException e) {
            System.out.println("Enter only numbers");
        }
    }
}
