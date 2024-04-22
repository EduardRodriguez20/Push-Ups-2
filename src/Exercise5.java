import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Ingrese el primer rango: ");
            int n = read.nextInt();
            System.out.print("Ingrese el segundo rango: ");
            int m = read.nextInt();
            if (n < 1 || m < 1) throw new IllegalArgumentException("Ingrese numeros mayores a 1");
            System.out.println(findPair(n, m));
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un número entero");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static String findPair(int n, int m){
        for (int x = n; x < m; x++){
            for (int y = n; y < m; y++){
                if (x != y){
                    if (getDivisors(x) == y && getDivisors(y) == x){
                        return x + " y " + y + " son el primer par de numeros amistosos en ese rango" ;
                    }
                }
            }
        }
        return "No se encontraron numeros amistosos en ese rango";
    }

    public static int getDivisors(int n){
        int divisors = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                divisors = divisors + i;
            }
        }
        return divisors;
    }
}
