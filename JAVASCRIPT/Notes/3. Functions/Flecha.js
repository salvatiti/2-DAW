/* Creamos variable saludar que va a ser igual a una funcion flecha en la que el parametro va a ser
nombre y nos va a devolver el nombre. No hace falta poner function ni return.
Tambien nos ahorramos los parentesis en la función si tiene solo un argumento, y los corchetes despues de => */

const saludar = nombre /*parametro*/ => `Hola, ${nombre}, como estas?`; //return
saludo = saludar('Juan');
console.log(saludo);

//seria igual a
function saludar1(nombre) {
    return `Hola, ${nombre}, como estas?`;
}
saludo1 = saludar1('Juan');
console.log(saludo1);

//Dos parametros
/*Flecha*/ let sumar = (a, b) => a + b;
/*Normal*/ let sumar1 = function(a, b) {
    return a + b;
};
