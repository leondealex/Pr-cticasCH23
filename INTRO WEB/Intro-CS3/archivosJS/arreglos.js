miVariable = 34;

let miArreglo = []; //declaracion literal
let miArreglo01 = new Array(); //declaracion por instancia

let miArreglo02 = [31,32,33,34]
console.log("Dato de miArreglo en el indice 0 - " + miArreglo[0]);
console.log("Dato de miArreglo en el indice 1 - " + miArreglo[1]);
console.log("Dato de miArreglo en el indice 2 - " + miArreglo[2]);
console.log("Dato de miArreglo en el indice 3 - " + miArreglo[3]);
console.log("El tamaño por numero de elementos del arreglo02 es: " + miArreglo02.length);

let miArreglo03 = ["Hola", "Qué", "Tal"];
console.log (miArreglo03[0]);
console.log (miArreglo03[1]);
console.log (miArreglo03[2]);
console.log("El tamaño por numero de elementos del arreglo03 es: " + miArreglo03.length);

let miArreglo04 = [{nombre:"Alex"},{apellido:"De Leon"},{edad:"32 años"}]
console.log ("Elemento del arreglo de tipo objeto miArreglo04: " + miArreglo04 [0].nombre);
console.log ("Elemento del arreglo de tipo objeto miArreglo04: " + miArreglo04 [1].apellido);
console.log ("Elemento del arreglo de tipo objeto miArreglo04: " + miArreglo04 [2].edad);
console.log("El tamaño por numero de elementos del arreglo04 es: " + miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4];
console.log ("Orden de mi Arreglo nuevo con metodo sort(): " + nuevoArreglo00.sort());
console.log ("Orden de mi Arreglo nuevo con metodo pop(): " + nuevoArreglo00.pop());
console.log ("Orden de mi Arreglo nuevo con metodo push(): " + nuevoArreglo00.push(10));
console.log ("Orden de mi Arreglo nuevo con metodo revrese(): " + nuevoArreglo00.reverse());

let otroArreglo = ["que ","hola ","tal "];
console.log("Orden de otro Arreglo nuevo con metodo sort(): " + otroArreglo.sort());
console.log("Orden de otro Arreglo nuevo con metodo pop(): " + otroArreglo.pop());
console.log("Orden de otro Arreglo nuevo con metodo push(): " + otroArreglo.push("estás", "sopita "));
console.log("Orden de otro Arreglo nuevo con metodo revrese(): " + otroArreglo.reverse());

console.log("Alejandro"[2]);
console.log("Alekandro".length);

let matriz = [[1,2,3],
              [4,5,6],
              [7,8,9]];
console.log("tamaño " + matriz.length);
console.log(matriz[1][1]);
console.log(matriz[2][1]);
console.log(matriz[0][2]);