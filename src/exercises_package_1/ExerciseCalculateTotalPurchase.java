package exercises_package_1;

import java.util.Scanner;

public class ExerciseCalculateTotalPurchase {
    public static void main(String[] args) {
        // Declaramos las variables necesarias
        int quantityProd = 0;
        double priceProd = 0, totalPurchase = 0;

        try (Scanner read = new Scanner(System.in);) {
            System.out.println("Bienvenido!\nIngrese la cantidad de productos que desea comprar");
            if (!read.hasNextInt()) {
                System.out.println(
                        "La cantidad de productos a registrar no es un valor numérico valido, por favor vuelva a intentarlo.");
                return;
            }
            quantityProd = read.nextInt();

            if (quantityProd <= 0) {
                System.out.println("La cantidad de productos a registrar debe ser mínimo 1.");
                return;
            }

            for (int i = 1; i <= quantityProd;) {
                System.out.print("Ingrese el precio del producto N-" + i + "\n" + "$");

                if (!read.hasNextDouble()) {
                    System.out.println(
                            "El precio ingresado no es un valor numérico valido, por favor vuelva a intentarlo.");
                    return;
                }
                priceProd = read.nextDouble();

                if (priceProd <= 0) {
                    System.out.println("El valor del producto debe ser superior a $0.");
                    continue;
                }

                totalPurchase = totalPurchase + priceProd;
                i++;
            }
        }
        System.out.println("El total de la compra es: $" + totalPurchase);
    }
}