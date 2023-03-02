// Solicitamos los tres números al usuario mediante prompts y los almacenamos en variables.
let num1 = Number(prompt("Ingresa el primer número"));
let num2 = Number(prompt("Ingresa el segundo número"));
let num3 = Number(prompt("Ingresa el tercer número"));

// Verificamos si los valores ingresados son números.
if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
    console.log("Al menos uno de los valores ingresados no es un número");
} else {
    // Identificamos el número mayor, el número del centro y el número menor.
    let mayor = Math.max(num1, num2, num3);
    let menor = Math.min(num1, num2, num3);
    let centro = (num1 + num2 + num3) - mayor - menor;

    // Imprimimos los números ordenados de mayor a menor y de menor a mayor.
    console.log(mayor + ", " + centro + ", " + menor);
    console.log(menor + ", " + centro + ", " + mayor);

    // Verificamos si los números son iguales.
    if (num1 === num2 && num1 === num3) {
        console.log("Los números ingresados son iguales");
    }
}


/*
Primero, utilizamos la función prompt para solicitar tres números al usuario y los almacenamos en variables.

Después, utilizamos la función isNaN para verificar si los valores ingresados son números. Si al menos uno de ellos no es un número, se imprime un mensaje en la consola indicando que hubo un error. Si los tres valores son números, continuamos con el proceso.

Utilizamos las funciones Math.max y Math.min para identificar el número mayor y el número menor respectivamente. Para encontrar el número del centro, simplemente restamos el número mayor y el número menor al total de los tres números ingresados.

Imprimimos los números ordenados de mayor a menor y de menor a mayor utilizando la concatenación de cadenas.

Verificamos si los números son iguales mediante la comparación de los valores ingresados.

Finalmente, si todos los valores ingresados son números y no hubo errores, el programa se ejecuta sin problemas y muestra los resultados.

Espero que este código te sea de ayuda. Si tienes alguna pregunta o necesitas más aclaraciones, no dudes en preguntarme.
*/
