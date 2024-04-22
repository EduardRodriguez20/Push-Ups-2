import java.util.*;

public class Exercise6 {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)){
            System.out.print("Numero de universidades: ");
            int quantity = read.nextInt();
            List<Integer> results = new ArrayList<>(List.of(0, 0, 0));
            System.out.println();
            for (int i = 0; i < quantity; i++) {
                System.out.print("Universidad: ");
                String name = read.next();
                String voto;
                List<Integer> votos = new ArrayList<>(List.of(0, 0, 0, 0));
                do {
                    System.out.print("Voto: ");
                    voto = read.next();
                    validVotos(voto, votos);
                } while (!voto.equalsIgnoreCase("X"));
                System.out.println(name + ": "+ votos.get(0) + " aceptan, " + votos.get(1) + " rechazan, " + votos.get(2) + " blancos, " + votos.get(3) + " nulos.");
                countVotos(votos, results);
            }
            System.out.println("Universidades que aceptan: " + results.get(0));
            System.out.println("Universidades que rechazan: " + results.get(1));
            System.out.println("Universidades con empate: " + results.get(2));
        } catch (InputMismatchException e) {
            System.out.println("Ingrese un numero entero");
        }
    }

    public static void validVotos(String voto, List<Integer> votos){
        switch (voto.toUpperCase()) {
            case "A":
                votos.set(0, votos.get(0) + 1);
                break;
            case "R":
                votos.set(1, votos.get(1) + 1);
                break;
            case "B":
                votos.set(2, votos.get(2) + 1);
                break;
            case "N":
                votos.set(3, votos.get(3) + 1);
                break;
            case "X":
                break;
            default:
                System.out.println("Ingrese una opcion valida.");
        }
    }

    public static void countVotos(List<Integer> votos, List<Integer> results){
        if (votos.get(0) > votos.get(1)) {
            results.set(0, results.get(0) + 1);
        } else if (votos.get(1) > votos.get(0)) {
            results.set(1, results.get(1) + 1);
        } else if (votos.get(0).equals(votos.get(1))) {
            results.set(2, results.get(2) + 1);
        }
        System.out.println();
    }
}
