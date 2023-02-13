


let dayNumber = parseInt(prompt("Escribe el numero de día: "));
let hourNumber = parseInt(prompt("Escribe la hora del día: "))




function businessHours(dayNumber, hourNumber) {
    return dayNumber >= 1 && dayNumber <= 5 && hourNumber >= 9 && hourNumber <= 18;
}

document.write("Es una hora hábil: " + businessHours(dayNumber, hourNumber));

//The businessHours function checks if the given hour number is within the business hours range of 9am to 6pm, represented by the hours 9 to 18 in the 24-hour clock system.



let janFirstDayNumber = parseInt(prompt("Escribe el numero de día de la semana: "));
let yearDayNumber = parseInt(prompt("Escribe el numero de día del año: "))


function getDayNumber(janFirstDayNumber, yearDayNumber) {
    return (janFirstDayNumber + yearDayNumber) % 7;
}

document.write("<br>Número de día : " + getDayNumber(janFirstDayNumber, yearDayNumber));

//The getDayNumber function calculates the day of the week corresponding to a given year day number. It does so by adding the day number of January 1st to the year day number, and taking the remainder of the result when divided by 7.




function isBusinessHours(date) {
    const dayNumber = getDayNumber(janFirstDayNumber, date.getDate());
    const hourNumber = date.getHours();
    return businessHours(dayNumber, hourNumber);
}

document.write("<br>Es hora hábil : " + businessHours(dayNumber, hourNumber));


//The getDayNumber function calculates the day of the week corresponding to a given year day number. It does so by adding the day number of January 1st to the year day number, and taking the remainder of the result when divided by 7.






/* function businessHours(dayNumber, hourNumber) {
    return dayNumber >= 1 && dayNumber <= 5 && hourNumber >= 9 && hourNumber <= 18;
}

function getDayNumber(janFirstDayNumber, yearDayNumber) {
    return (janFirstDayNumber + yearDayNumber) % 7;
}

function isBusinessHours(date) {
    const dayNumber = getDayNumber(janFirstDayNumber, date.getDate());
    const hourNumber = date.getHours();
    return businessHours(dayNumber, hourNumber);
}
  


In the function isBusinessHours, you can pass a Date object as the date parameter.The getDate method of the Date object returns the day of the month as an integer and the getHours method returns the hour as an integer in the 24 - hour clock system.

The janFirstDayNumber parameter in the isBusinessHours function should be passed a value representing the day of the week of January 1st for a specific year.This value should be an integer between 0 and 6, where 0 represents Sunday, 1 represents Monday, and so on.