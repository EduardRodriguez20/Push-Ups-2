import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Ingrese n: ");
            int n = read.nextInt();
            if (n < 1) throw new IllegalArgumentException("Ingrese un numero mayor a 1");
            System.out.println("F" + n + " = " + getFibonacci(n));
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un número entero");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static int getFibonacci(int n){
        List<Integer> fibonacci = new ArrayList<>(List.of(0,1,1));
        for (int x = 3; x < n; x++){
            fibonacci.add(fibonacci.get(x-1) + fibonacci.get(x-2));
        }
        return fibonacci.get(n-1);
    }
}
