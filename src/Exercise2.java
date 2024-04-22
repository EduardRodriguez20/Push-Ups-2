import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Ingrese un numero: ");
            int n = read.nextInt();
            if (n < 1) throw new IllegalArgumentException("Ingrese un numero mayor a 1");
            if (isFibonacci(n)){
                System.out.println(n + " es un numero de Fibonacci");
            }else {
                System.out.println(n + " no es un numero de Fibonacci");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un número entero");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean isFibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        while (num2 < n) {
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
        }
        return num2 == n;
    }
}
