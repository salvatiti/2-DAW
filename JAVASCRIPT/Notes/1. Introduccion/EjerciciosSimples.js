//Numero par o impar
let a = 3;
if (a % 2 == 0) {
  console.log("Numero par");
} else {
  console.log("Numero Impar");
}

//Mayor edad
let edad = 20,
  adulto = 18;
if (edad >= adulto) {
  console.log("Eres mayor de edad");
} else {
  console.log("Eres menos de edad");
}

//Rango
let b = 55;
let valMinimo = 0,
  valMaximo = 10;
if (b >= valMinimo && b <= valMaximo) {
  console.log("Dentro de rango");
} else {
  console.log("Fuera de rango");
}

//Padre que puede ir a ver el partido de su hijo si no esta trabajando o tiene vacaciones
let diaDescanso = false,
  vacaciones = false;
if (diaDescanso || vacaciones) {
  console.log("Puede ir al partido");
} else {
  console.log("No puede ir al partido");
}

//Operador Ternario
let resultado = 1 > 2 ? "verdadero" : "falso";
console.log(resultado);

let numero = 2;
resultado = numero % 2 == 0 ? "Numero Par" : "Numero Impar";
console.log(resultado);

//Conversion String a Number
let miNumero = "19";
console.log(typeof miNumero);

let edadd = Number(miNumero);
console.log(typeof edad);
if (edadd >= 18) {
  console.log("Puede votar");
} else {
  console.log("No puede votar");
}

let resultados = (edadd >= 18) ? "Puede votar" : "No puede votar";
console.log(resultados);
