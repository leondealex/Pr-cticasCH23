let celsius = parseFloat(prompt("Ingresa la temperatura en grados Celsius:"));

while (isNaN(celsius)) {
  celsius = parseFloat(prompt("Error: Ingresa un número válido para la temperatura en grados Celsius:"));
}

let fahrenheit = (celsius * (9/5)) + 32;
let kelvin = celsius + 273.15;

let resultadoFahrenheit = "Grados Fahrenheit: " + fahrenheit.toFixed(1);
let resultadoKelvin = "Grados Kelvin: " + kelvin.toFixed(2);

document.getElementById("resultado").innerHTML = resultadoFahrenheit + "<br>" + resultadoKelvin;
