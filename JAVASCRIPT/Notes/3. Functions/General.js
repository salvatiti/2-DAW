
//Función con argumentos
function miFuncion(a, b){
console.log("Suma : " + (a+b));

}
miFuncion(2,4);

//Función con return
function miFuncion1(a,b){
    return a + b;
}
let resultado = miFuncion1(2,3);
console.log(resultado);

//Función tipo expresión
let sumar = function(a,b){return a + b};
resultado = sumar(1,2);
console.log(resultado);

//Función self invoking
(function(a, b){
    console.log("Ejecutando la función: " + (a+b));
})(3, 4);

//Funciones flecha
//Function se sustituye por el =, en vez de abrir y cerrar llaves se usa =>,
// Ya no se usa el return, sino que se pone directamente lo que devuelve despues de la flecha =>
const sumarFuncionFlecha = (a,b) => a + b;
resultado = sumarFuncionFlecha(2,4);
console.log(resultado);

//Funcion sumando argumentos
let resultado1 = sumarArgumentos(2, 5, 2, 6, 7, 25,6);
function sumarArgumentos(){
    let suma = 0;
    for(let i = 0; i<arguments.length;i++){
        suma+= arguments[i];
    }
    return suma;
}
console.log(resultado1);
  




