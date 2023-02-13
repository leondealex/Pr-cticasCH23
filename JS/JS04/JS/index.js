//let miVariable = 5;

// let miArray = new Array();
//console.log("miArray" + miArray(0));
//console.log("miArray" + miArray[1]);

let miArray1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

for (let m = 0; m < 3; m++) {
    for (let j = 0; j < 3; j++) {
        console.log("Imprimiendo la matriz1: " + miArray1[m][j])
    }
}

console.log("miArray1" + miArray1[0][1]);
console.log("miArray1" + miArray1[0][2]);
console.log("miArray1" + miArray1[2][1]);
console.log("miArray1" + miArray1[1][2]);
console.log("miArray1" + miArray1[1][0]);


console.log("Todo el indice " + miArray1[0]);
console.log("Todo el indice " + miArray1[1]);
console.log("Todo el indice " + miArray1[2]);
/**************** Ciclo For ******************/

for (let i = 0; i < 10; i++) {
    console.log("Imprimiendo i: " + i);
}

for (let k = 10; k >= 0; k--) {
    console.log("Imprimiendo k: " + k);
}

let miArray = [2, 3, 4, 5, 6, 7];

for (let p = 0; p <= 5; p++) {
    console.log("Imprimiendo miArray: " + miArray);
}




let miArray2 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];
let matrizR = [
    [], [], []
]

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray2[i][j] * miArray2[i][j];
    }

}
console.log("MatrizR->" + matrizR);



for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log("matrizR -> " + miArray2[i][j]);
    }
}

let contador = 0;
while (contador < 10) {
    console.log(contador);
    contador++;
}


//Ejercisio 2
//Parte 1
let personas = ["Sofia", "David", "Juan"];
personas.push(" Sara, Agustín");

//Parte 2
let primeraPersona = personas.shift();
console.log("First person called to the teller: " + primeraPersona);
console.log("Personas en la fila: " + personas);

//Parte 3
personas.splice(1, 0, "Renata");
personas.push(" Elena");
console.log("Personas en la fila: " + personas);



//Ejercisio 2
for (let i = 1; i <= 5; i++) {
    let pattern = '';
    for (let j = 1; j <= i; j++) {
        pattern += '* ';
    }
    console.log(pattern);
}

let asterisco = "* ";
for (let i = 0; i < 5; i++) {
    console.log(asterisco);
    asterisco += "* ";
}


//Ejercisio 3
let xValue = 10;
while (xValue > 0) {
    console.log(xValue);
    xValue -= 0.5;
}

//Print all the odd numbers between 1 - 100.
for (let i = 1; i <= 100; i++) {
    if (i % 2 != 0) { //Si el resto de la división es distinto de 0, es impar
        console.log(i);
    }
}




//Ejercisio 3
//Parte 1
let Value = 10;
while (xValue > 0) {
  console.log(Value);
  Value -= 0.5;
}

//Parte 2
let num = 1;
while (num <= 100) {
  if (num % 2 !== 0) {
    console.log(num);
  }
  num++;
}

//Parte 3
function printNumbersInBrackets(n) {
    let i = 1;
    while (i <= n) {
      console.log("[" + i + "]");
      i++;
    }
  }

//Parte 4
function sumOfFirstNPositiveIntegers(n) {
    let sum = 0;
    let i = 1;
    while (i <= n) {
      sum += i;
      i++;
    }
    return sum;
  }
  