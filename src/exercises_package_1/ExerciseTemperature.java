package exercises_package_1;

import java.util.Scanner;

public class ExerciseTemperature {
    public static void main(String[] args) {
        // Declaración de variables
        double tempFahrenheit = 0, tempCelsius = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Fahrenheit que quiere convertir a Celsius:");
        tempFahrenheit = read.nextFloat();

        // Conversión de temperatura
        tempCelsius = (tempFahrenheit - 32) / 1.8;

        // Impresión por consola
        System.out.println("La temperatura para precalentar el horno es: " + tempCelsius);
        read.close();
    }
}