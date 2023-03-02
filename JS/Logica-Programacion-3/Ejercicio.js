function calcularFactorial() {
    let numero = parseInt(document.getElementById("numero").value);

    // Verificar que el dato de entrada es un número entero
    if (isNaN(numero) || !Number.isInteger(numero)) {
        document.getElementById("resultado").textContent = "Error: Introduzca un número entero.";
        return;
    }

    let factorial = 1;
    for (let i = 2; i <= numero; i++) {
        factorial *= i;
    }

    document.getElementById("resultado").textContent = "El factorial de " + numero + " es " + factorial + ".";
}


 // Este programa utiliza la función parseInt() para convertir el valor introducido por el usuario en un número entero. Luego, verifica que el valor introducido sea un número entero utilizando la función isNaN() y Number.isInteger(). Si el valor no es un número entero, se muestra un mensaje de error en el DOM.

 // Luego, el programa calcula el factorial del número utilizando un bucle for y la variable factorial. Finalmente, muestra el resultado del factorial en el DOM utilizando la función textContent.