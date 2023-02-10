
let diaDeLaSemana = parseInt(prompt("Qué numero de día es hoy?"));

if (diaDeLaSemana === 0){
    document.write("Hoy es Domingo")
} else if (diaDeLaSemana === 1){
    document.write("Hoy es Lunes")
} else if (diaDeLaSemana === 2){
    document.write("Hoy es Martes")
} else if (diaDeLaSemana === 3){
    document.write("Hoy es Miércoles")
} else if (diaDeLaSemana === 4){
    document.write("Hoy es Jueves")
} else if (diaDeLaSemana === 5){
    document.write("Hoy es Viernes")
} else if (diaDeLaSemana === 6){
    document.write("Hoy es Sábado")
} else if (diaDeLaSemana => 7){
    document.write("Número de día inválido")
}