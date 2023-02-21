/*
// Generar número secreto aleatorio
var numeroSecreto = 37

// Inicializar array de números introducidos
var numerosIntroducidos = [];

// Solicitar número al usuario
do {
    var numero = Number(prompt("Ingresa un número del 1 al 100:"));
    if (isNaN(numero) || numero < 1 || numero > 100) {
        alert("El número ingresado no es válido. Ingresa un número del 1 al 100.");
    } else {
        numerosIntroducidos.push(numero);
        if (numero === numeroSecreto) {
            alert("¡Felicidades, adivinaste el número secreto!");
            console.log("Números introducidos: " + numerosIntroducidos);
        } else {
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
        }
    }
} while (numero !== numeroSecreto);
*/




/*
class game {

    secretNumber = 50;
    attemp = [];

    play() {

        let number;

        do {

            number = Number(prompt("Ingresa un numero del 1 al 100"));

            if (number < 0, number > 100) {
                alert("Numero no válido")
            }

            else if (number == this.secretNumber) {
                alert("Felicitaciones, encontraste el numero");
                console.log("Numeros Introducidos: ", this.attemp);
                return;
            }

            else {
                this.attemp.push(number);
                alert("Ese no es el numero secreto, intenta de nuevo")
            }
        } while (true);
    }

}

const playGame = new game();
playGame.play();
*/




/*
class JuegoAdivinanza {
    constructor() {
      this.numeroSecreto = 37;
      this.numerosIntroducidos = [];
    }
  
    jugar() {
      let numero;
      do {
        numero = Number(prompt("Ingresa un número del 1 al 100:"));
        if (isNaN(numero) || numero < 1 || numero > 100) {
          alert("El número ingresado no es válido. Ingresa un número del 1 al 100.");
        } else {
          this.numerosIntroducidos.push(numero);
          if (numero === this.numeroSecreto) {
            alert("¡Felicidades, adivinaste el número secreto!");
            console.log("Números introducidos: " + this.numerosIntroducidos);
            this.mostrarNumerosIntroducidos();
          } else {
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
          }
        }
      } while (numero !== this.numeroSecreto);
    }
  
    mostrarNumerosIntroducidos() {
      const numeros = this.numerosIntroducidos.join(", ");
      const resultadoDiv = document.getElementById("resultado");
      resultadoDiv.innerHTML = `Números introducidos: ${numeros}`;
    }
  }
  
  const juego = new JuegoAdivinanza();
  juego.jugar();
  
  */

  
  class JuegoAdivinanza {
    constructor() {
      this.numeroSecreto = 37;
      this.numerosIntroducidos = [];
    }
  
    jugar() {
      let numero;
      do {
        numero = Number(prompt("Ingresa un número del 1 al 100:"));
        if (isNaN(numero) || numero < 1 || numero > 100) {
          alert("El número ingresado no es válido. Ingresa un número del 1 al 100.");
        } else {
          this.numerosIntroducidos.push(numero);
          if (numero === this.numeroSecreto) {
            alert("¡Felicidades, adivinaste el número secreto!");
            console.log("Números introducidos: " + this.numerosIntroducidos);
            this.mostrarNumerosIntroducidos();
          } else {
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
          }
        }
      } while (numero !== this.numeroSecreto);
    }
  
    mostrarNumerosIntroducidos() {
      const numeros = this.numerosIntroducidos.join(", ");
      const resultadoDiv = document.getElementById("resultado");
      resultadoDiv.innerHTML = `Números introducidos: ${numeros}`;
    }
  }
  
  const juego = new JuegoAdivinanza();
  juego.jugar();
  