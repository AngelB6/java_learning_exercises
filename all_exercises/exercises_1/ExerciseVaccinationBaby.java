package exercises_1;

import java.util.Scanner;

public class ExerciseVaccinationBaby {
    public static void main(String[] args) {
        // Declaración de variables
        float weightBaby = 0, ageBaby = 0, vaccineDose = 0;
        String nameNurse, nameBaby;

        // Instancia de scanner para la captura de valores por consola
        Scanner read = new Scanner(System.in);

        // Captura de datos por consola
        System.out.println("Bienvenido\nEnfermera por favor ingrese su nombre: ");
        nameNurse = read.nextLine();

        System.out.println(nameNurse + " ingrese el nombre del bebe:");
        nameBaby = read.nextLine();

        System.out.println(nameNurse + " ingrese el peso de " + nameBaby + ":");
        weightBaby = read.nextInt();

        System.out.println("Ingrese los meses de " + nameBaby + ":");
        ageBaby = read.nextInt();

        // Calculo de dosis de vacuna
        vaccineDose = ((weightBaby + 10) / (ageBaby * 10)) * 8;

        // Impresión por consola
        System.out.println("---------------------------------------------------------");
        System.out.println(nameNurse + " la dosis de la vacuna es: " + vaccineDose);

        // Limpiamos el buffer
        read.close();
    }
}