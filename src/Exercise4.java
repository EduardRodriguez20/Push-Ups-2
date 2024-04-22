import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Ingrese multiplicador: ");
            int ador = read.nextInt();
            System.out.print("Ingrese multiplicando: ");
            int ando = read.nextInt();
            if (ador < 1 || ando < 1) throw new IllegalArgumentException("Ingrese números mayores a 1");
            int sum = 0;
            while (ador >= 1){
                if (ador % 2 != 0){
                    sum = sum + ando;
                }
                ador = ador / 2;
                ando = ando * 2;
            }
            System.out.println("Resultado: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un número entero");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
