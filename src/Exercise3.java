import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Ingrese m: ");
            int n = read.nextInt();
            if (n < 1) throw new IllegalArgumentException("Ingrese un numero mayor a 1");
            System.out.println("Los " + n + " primeros numeros de Fibonacci son:");
            System.out.println(getFibonacci(n));
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un número entero");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<Integer> getFibonacci(int n){
        List<Integer> fibonacci = new ArrayList<>(List.of(0,1,1));
        for (int x = 3; x < n; x++){
            fibonacci.add(fibonacci.get(x-1) + fibonacci.get(x-2));
        }
        return fibonacci;
    }
}
