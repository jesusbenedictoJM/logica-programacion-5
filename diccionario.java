import java.util.*;

public class diccionario {
    public static void main(String[] args) {
        // 1. Crear diccionario Español-Inglés con al menos 20 palabras
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("coche", "car");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("escuela", "school");
        diccionario.put("profesor", "teacher");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ciudad", "city");
        diccionario.put("mar", "sea");
        diccionario.put("cielo", "sky");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("flor", "flower");
        diccionario.put("árbol", "tree");

        // 2. Escoger 5 palabras aleatorias
        List<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras); 
        List<String> seleccionadas = palabras.subList(0, 5);

        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("Traduce las siguientes palabras al inglés:");

        // 3. Pedir traducción al usuario y comprobar
        for (String palabra : seleccionadas) {
            System.out.print(palabra + ": ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabra).toLowerCase();

            if (respuesta.equals(traduccionCorrecta)) {
                System.out.println("✅ Correcto");
                correctas++;
            } else {
                System.out.println("❌ Incorrecto. Respuesta correcta: " + traduccionCorrecta);
                incorrectas++;
            }
        }

        // 4. Mostrar resultados finales
        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
