package exercises_package_1;

import java.util.Scanner;

public class ExerciseRockPaperScissors {

    public static String optionSelectedInfo(String prefixText, int optSelected) {
        switch (optSelected) {
            case 1:
                return prefixText + " Piedra";
            case 2:
                return prefixText + " Papel";

            case 3:
                return prefixText + " Tijera";

            default:
                return "Error en la selección. Por favor vuelva a intentarlo.";
        }
    }

    public static void main(String[] args) {
        // Declaramos las variables
        int opt, machine = (int) (Math.random() * 3 + 1);
        String result;

        // Instancia de Scanner
        try (Scanner read = new Scanner(System.in)) {

            System.out.println("Bienvenido!\nSeleccione una de las opción\n1. Piedra\n2. Papel\n3. Tijera");
            opt = read.nextInt();

            if (opt != 1 && opt != 2 && opt != 3) {
                System.out.println("Error en la selección de la maquina. Por favor vuelva a intentarlo.");
                return;
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println(optionSelectedInfo("La maquina ha seleccionado", machine));
        System.out.println(optionSelectedInfo("Usted ha seleccionado", opt));
        System.out.println("---------------------------------------------------");

        result = (machine == opt) ? "Usted empato"
                : ((((machine - opt) + 3) % 3) == 1) ? "Usted perdió" : "Usted ganó";

        System.out.println(result);
    }
}