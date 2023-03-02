package Funciones;

import java.text.DecimalFormat;

public class AlturaTorre {
    public static void main(String[] args) {
        // Altura de la torre
        double alturaTorre;

        // Ángulo de elevación en grados
        double anguloElevacion = 30;

        // Distancia entre la persona y la torre
        double distancia = 100;

        // Convertir el ángulo a radianes
        double anguloRadianes = Math.toRadians(anguloElevacion);

        // Calcular la altura de la torre
        alturaTorre = distancia * Math.tan(anguloRadianes);

     // Formatear los resultados con dos decimales
        DecimalFormat df = new DecimalFormat("#.##");
        String distanciaFormateada = df.format(distancia);
        String alturaFormateada = df.format(alturaTorre);

        // Imprimir resultados
        System.out.println("La base es de " + distanciaFormateada
        		+ " metros.");
        System.out.println("La altura de la torre es de "
        		+ alturaFormateada + " metros.");
    }
}


/*

En este código, primero declaramos el ángulo de elevación en grados y
la distancia entre la persona y la torre. Luego, usamos la función
Math.toRadians() para convertir el ángulo a radianes, que es lo que
necesita la función tangente.

A continuación, calculamos la altura de la torre utilizando la fórmula
alturaTorre = distancia * Math.tan(anguloRadianes).

También, hemos importado la clase DecimalFormat y hemos creado un
objeto df utilizando el patrón #.##, que indica que queremos mostrar
dos decimales.

A continuación, hemos utilizado el objeto df para formatear la
distancia y la altura de la torre utilizando df.format(distancia)
y df.format(alturaTorre). Esto devuelve cadenas formateadas con
dos decimales.

Finalmente, imprimimos el resultado en la consola utilizando
System.out.println().

*/