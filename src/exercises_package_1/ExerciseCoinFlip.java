package exercises_package_1;

import java.util.Scanner;

public class ExerciseCoinFlip {
    public static void main(String[] args) {
        // Declaramos las variables
        int selectionUser, selectedMachine = (int) (Math.random() * 2 + 1);

        // Instancia de Scanner
        Scanner read = new Scanner(System.in);

        System.out.println("Bienvenido al juego carisellazo!\nIngrese la opción que desea\n1. Cara\n2. Sello");
        selectionUser = read.nextInt();
        read.close();

        if (selectionUser != 1 && selectionUser != 2) {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.println(
                "Usted seleccionó " + (selectionUser == 1 ? "Cara" : "Sello") + "\nLa moneda está girando.........");
        System.out.println(selectionUser == selectedMachine ? "Felicidades, ha ganado" : "Perdiste");
    }
}