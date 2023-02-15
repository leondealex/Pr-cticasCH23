//Ejercicio 1
//Parte 1

var nombres = ["Maria", "Antony", "Joy", "Juan"]

function agregarNombre(nombre, listaNombres) {
    listaNombres.push(nombre);
}
agregarNombre("Mi nombre", nombres); // Agrega "Tu_nombre" al final de la lista

console.log(nombres);


//Parte 2

var nombres = ["Maria", "Antony", "Joy", "Juan"]

function verificarNombre(nombre, listaNombres) {
    return listaNombres.includes(nombre);
}


let primerNombre = verificarNombre("Maria", nombres); // Devuelve true
let segundoNombre = verificarNombre("Pedro", nombres); // Devuelve false

console.log(primerNombre);
console.log(segundoNombre);


//Parte 3

var nombres = ["Maria", "Antony", "Joy", "Juan"]

function nombresComunes(lista1, lista2) {
    return lista1.filter(nombre => lista2.includes(nombre));
}
var listaActual = ["Pepe", "Antony", "Isabel", "Juan"];
let coincidencias = nombresComunes(nombres, listaActual); // Devuelve "Antony", "Juan"]

console.log(coincidencias)

//Parte 4

var nombres = ["Maria", "Antony", "Joy", "Juan"]

function longitudNombres(listaNombres) {
    var listaLongitudes = [];
    listaNombres.forEach(nombre => listaLongitudes.push(nombre.length));
    return listaLongitudes;
}
let longitudes = longitudNombres(nombres); // Devuelve [5, 6, 3, 4]

console.log("Las longitudes son: " + longitudes);



//Ejercicio 2

console.log(false || (true && false)); // false
console.log(true || (11 + 12)); // true
console.log((31 + 22) || true); // 53
console.log(true && (1 + 7)); // 8
console.log(false && (3 + 4)); // false
console.log((1 + 2) && true); // true
console.log((32 * 4) >= 129); // true
console.log(false !== !true); // true
console.log(true === 4); // false
console.log(false === (847 === '847')); // true
console.log(false === (887 == '887')); // true
console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false); // true


//Ejercicio 3

function rangoNumero(num) {

    if (num >= 0 && num <= 25) {
        console.log(num + ' Está entre 0 y 25');
    } else if (num >= 26 && num <= 100) {
        console.log(num + ' Esta entre 26 y 100');
    } else if (num > 100) {
        console.log(num + ' Es mayor que 100');
    } else {
        console.log(num + ' Es menor a 0');
    }
}

rangoNumero(25);
rangoNumero(75);
rangoNumero(125);
rangoNumero(-25);