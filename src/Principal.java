import java.util.*;
//import javax.swing.*;
public class Principal {
    public static void main(String[] args){
        System.out.println("Bienvenidos a la inmersion en Java");
//        System.out.println("Pelicula Matrix");
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio;
                """;
        double mediaEvaluacionMatrix = 0.0;
        System.out.printf("""
                Pelicula: %s
                Fecha de Lanzamiento: %d
                Sinopsis: %s
                Evaluacion: %.1f
                Incluido: %b
                """,nombre,fechaDeLanzamiento,sinopsis,evaluacion,incluidoEnElPlanBasico);

        double mediaEvaluacion = 3.2 + 1.8 + 4.9 / 3;

        String resultadoMedia = String.format("La media es: %.1f" , mediaEvaluacion);
        System.out.println(resultadoMedia);

        if (fechaDeLanzamiento < 2023){
            System.out.println("Pelicula popular del momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner evaluacionesUsuario = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a la pelicula Matrix");
            double evaluacionMatrix = evaluacionesUsuario.nextDouble();
            mediaEvaluacionMatrix = mediaEvaluacionMatrix + evaluacionMatrix;
        }
        String resultadoMediaEvaluacione = String.format("La media de la pelicula. Matrix calculada por el usuario es: %.1f",mediaEvaluacionMatrix/3);
        System.out.println(resultadoMediaEvaluacione);

    }
}