//lenght(obtener el tamaño del array)
const dias = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 
                'Sabado', 'Domingo'];
console.log(dias.length);
//para añadir un elemento al final del array se usa con el metodo length del array
dias[dias.length] = "Juernes";
console.log(dias);

//instanceof(comprueba si el objeto pertenece a la clase Array)
console.log(dias instanceof Array);

//push(añadir elementos al final del Array, hay que indicar el valor que le damos al elemento)
//pop(quitar elementos del final del Array)
const paises =["Portugal",'Inglaterra'];
paises.push("Alemania");
console.log(paises);
//se puede asignar el elemento que se retira del Array a una variable para
let paisOlivdado = paises.pop();
console.log(paisOlivdado);
console.log(paises);
//unshift(añadir elementos al principio del Array, hay que indicar el valor que le damos al elemento)
//shift(quita elementos del principio del Array)
paises.unshift("Belgica");
console.log(paises);
let paisOlvidado2 = paises.shift();
console.log(paisOlvidado2);
console.log(paises);

//concat(juntar dos Arrays diferentes en uno, no se modifica ninguno de los anteriores Arrays)
const dias1 = ['Lunes', 'Martes', 'Miercoles', 'Jueves'];
const dias2 = [ 'Viernes', 'Sabado', 'Domingo'];
todos = dias1.concat(dias2);
console.log(todos);

//slice(obtener subarrays indicando el primer elemento que deseamos copiar y el indice final)
console.log(dias.slice(1,4));
//tambien nos permite hacer una copia de un array.
let diass = dias.slice();
console.log(diass);

//splice(Se eliminan elementos del Array y modifica el Array original, sin dejar undefined,
//se toma el primer valor desde donde queremos empezar a eliminar y despues el numero de elementos a eliminar)
const nba = ['Lakers', 'Bucks', 'Warriors', 'Nuggets', 'Bulls'];
let borrados = nba.splice(1,3);
console.log(`Se han borrado ${borrados}`);
console.log(`Quedan ${nba}`);
//Tambien se puede cambiar por los elementos que queramos
//Añadir desde la posicion 1 y eliminar 0 elementos
nba.splice(1,0,"Heat")
//Cambiar 1 elemento de la posicion 2
nba.splice(2,1, "Warriors")
console.log(nba);

//join(convertir array en String)
console.log(nba.join());

//indexOf(buscar elementos en un array empezando por la izquierda)
console.log(nba.indexOf("Heat"));

//includes(busca un elemento y devuelve true si el valor esta en el array)
console.log(nba.includes("Heat"));

//reverse(invertir los elementos del array)
console.log(dias.reverse());

//sort(ordenar los elementos del array)
console.log(dias.sort());

//desestructuracion
let[numero1,numero2]=[10,Math.random()*100];
console.log(numero2);

//spread (convierte un array en variables y viceversa)
let array = [1,2,3];
let [x,y,z] = [...array]
console.log(x);
console.log(y);