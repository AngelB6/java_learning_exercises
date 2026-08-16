package exercises_package_1;

import java.util.Map;
import java.util.Scanner;

public class ExerciseZodiacSign {

    public record ZodiacSingRecord(String sign, String monthStart, int dateStart, String monthEnd, int dateEnd,
            String description) {
    }

    public static void main(String[] args) {
        // Declaramos las variables necesarias
        String month = "";
        int day = 0;
        ZodiacSingRecord[] signs = {
                new ZodiacSingRecord("Capricornio", "diciembre", 22, "enero", 19,
                        "Se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen."),
                new ZodiacSingRecord("Acuario", "enero", 20, "febrero", 18,
                        "Simpático, original y brillante, es un signo muy humanitario, al mismo tiempo que independiente e intelectual."),
                new ZodiacSingRecord("Piscis", "febrero", 19, "marzo", 20,
                        "Sensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar."),
                new ZodiacSingRecord("Aries", "marzo", 21, "abril", 19,
                        "Se caracteriza por ser una persona rebosante de energía y entusiasmo."),
                new ZodiacSingRecord("Tauro", "abril", 20, "mayo", 20,
                        "Personas firmes, decididas y constantes en varios sentidos."),
                new ZodiacSingRecord("Géminis", "mayo", 21, "junio", 20,
                        "Se adaptan con facilidad y rapidez a todo"),
                new ZodiacSingRecord("Cáncer", "junio", 21, "julio", 22,
                        "Puede ser desde retraído, insociable y pelma, hasta deslumbrante, atractivo y admirado por los demás."),
                new ZodiacSingRecord("Leo", "julio", 23, "agosto", 22,
                        "Creativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo."),
                new ZodiacSingRecord("Virgo", "agosto", 23, "septiembre", 22,
                        "Espíritu crítico, precisión, reserva, paciencia y convencionalismo."),
                new ZodiacSingRecord("Libra", "septiembre", 23, "octubre", 22,
                        "Tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos."),
                new ZodiacSingRecord("Escorpio", "octubre", 23, "noviembre", 21,
                        "Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno."),
                new ZodiacSingRecord("Sagitario", "noviembre", 22, "diciembre", 21,
                        "Es versátil, adora las aventuras y buscar nuevos horizontes, ya que tiene una mente abierta a nuevas ideas y experiencias y mantiene una actitud decidida ante la adversidad.") };

        Map<String, Integer> months = Map.ofEntries(Map.entry("enero", 31), Map.entry("febrero", 28),
                Map.entry("marzo", 31), Map.entry("abril", 30), Map.entry("mayo", 31), Map.entry("junio", 30),
                Map.entry("julio", 31), Map.entry("agosto", 31), Map.entry("septiembre", 30), Map.entry("octubre", 31),
                Map.entry("noviembre", 30), Map.entry("diciembre", 31));

        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Bienvenido!\nIngrese el mes en el que nació:");
            month = read.nextLine();

            if (!months.containsKey(month.trim().toLowerCase())) {
                System.out.println("El mes seleccionado no es valido, por favor vuelva a intentarlo.");
                return;
            }

            System.out.println("Ingrese el día en el que nació:");
            day = read.nextInt();

            if (day <= 0 || day > months.get(month.trim().toLowerCase())) {
                System.out.println(
                        "El día ingresado no es valido, recuerde que " + month.trim().toLowerCase() + " tiene ("
                                + months.get(month.trim().toLowerCase()) + ")");
                return;
            }
        }

        for (ZodiacSingRecord sign : signs) {
            if ((sign.monthStart.equalsIgnoreCase(month.trim()) && day >= sign.dateStart)
                    || (sign.monthEnd.equalsIgnoreCase(month.trim()) && day <= sign.dateEnd)) {
                System.out.println("Signo " + sign.sign + ": " + sign.description);
                return;
            }
        }
    }
}