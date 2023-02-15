let GPAacumulativo = 2.1
let Unidadestotales = 120

if (GPAacumulativo > 2.0 && Unidadestotales >= 120) {
    console.log("Puede graduarse")
}


let cspCalificacion = 75
if (cspCalificacion>=75){
    console.log("¡Eres elegible para graduación!");
}

let progCalificación = 75
if (progCalificación>=75){
    console.log("¡Eres elegible para graduación!");
}



/*let texto = "Hola Mundo";
let mensaje = "";
for (let index = 0; index < texto.length; index++) {
    mensaje += texto[index] + ".";
}
mensaje = mensaje.trim();
console.log (mensaje);*/


let texto = "Hola mundo";
let texto2 = "";
for (let i = 0; i < texto.length; i++) {
    if (texto[i] != " ") {
        texto2 += texto[i] + ".";
    } else {
        texto2 += " ";
    }
}
console.log(texto2);