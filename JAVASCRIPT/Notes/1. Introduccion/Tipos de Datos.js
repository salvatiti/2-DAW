//Sting
let nombre = `pepe`;
console.log(nombre);

nombre = 10;
console.log(typeof nombre);

//numerico
let numero = 1000;
console.log(numero);

//object
let objeto = {
  nombre: "Juan",
  apellido: "Perez",
  telefono: "2352245",
};
console.log(objeto);

//boolean
let bandera = true;
console.log(bandera);

//funcion
function miFuncionSuma(a, b) {
  console.log("Suma de " + a + " + " + b + " = " + (a+b));
}
miFuncionSuma(2,4)


//symbol
let simbolo = Symbol("mi simbolo");
console.log(simbolo);

//clase
class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}
console.log(Persona);

//undefined
var x;
console.log(x);

//null
var y = null;
console.log(y);

//array
let coches = ["Bmw", `Audi`, `Volvo`];
console.log(coches);
console.log(typeof coches);

//cadena vacia
let z = "";
console.log(z);
console.log(typeof z);