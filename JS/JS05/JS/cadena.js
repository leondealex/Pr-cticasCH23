let texto = "Hola Mundo";


if (texto.includes("Mu")) {
    console.log("Se incluye/True");
} else {
    console.log("El(los) caracteress no estan en el texto/False")
}

let palabra3 = texto.split(" ");
console.log(palabra3[0] + "/" + palabra3[1]);

let palabra2 = texto.substring(5,7);
console.log(palabra2);

let palabra = texto.substr(2);
console.log(palabra);

let mensaje2 = texto.toLocaleUpperCase();
console.log(mensaje2);

let mensaje1 = "";
for (let index = 0; index < texto.length; index++) {
    mensaje1 += texto[index] + " ";
}
mensaje1 = mensaje1.trim(); //Borra el espacio vacío al final
console.log(mensaje1);

let mensaje = "El texto tiene " + texto.length + " Caracteres";
console.log(mensaje);

