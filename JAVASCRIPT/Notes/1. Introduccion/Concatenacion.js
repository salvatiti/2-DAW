let nombre = "Juan";
let apellido = "Perez";
let nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);

//se evalua de izquierda a derecha
//si primero hay una cadena se toma todo como una cadena a no ser que este entre parentesis
let x = nombre + 100 + 2 + " " + apellido;
console.log(x);
x = nombre + (100 + 2);
console.log(x);
//si primero hay un numero se toma todo como un numero y luego la cadena si la hubiese
x = 100 + 2 + nombre;
console.log(x);
