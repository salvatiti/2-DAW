//Cuando se asigna la variable datos2 al array datos no se hace una copia del Array.
//datos y datos2 son dos variables que hacen referencia al mismo array.
const datos = [4.5,6.73,7.21];
const datos2 = datos;
datos2[0] = 400;
console.log(datos[0]);

//El Array tiene posicones 0 y 1, al agregarle la posicion 3, dejamos un espacio en la 2 por lo que sale undefined
const nombres = ["pepe", "maria"];
nombres[3] = "Juan";
console.log(nombres[2]);

//delete(eliminar elementos)
//Cuando eliminas un elemento del Array, la posición se queda vacia
nombres[2] = "Antonio"
console.log(nombres);
delete nombres[2];
console.log(nombres);

//Array Heterogéneos
//Pueden haber subArrays dentro de Arrays. Para llegar a ellos tenemos que indicar la posicion 
// donde esta el subArray, y luego la posicion que queremos dentro del subArray.
const heterogeneo = [3,4,"Hola",true,[19,39,21], parseInt(Math.random()*100)]
console.log(heterogeneo[4][1]);
console.log(heterogeneo[5]);