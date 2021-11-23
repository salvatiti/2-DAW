//FILTER. Devuelve aquellos elementos que cumplan las condiciones del filtro,
//que son guardados en un nuevo array.
const array = [
{id:1, username:'Mapper'},
{id:2, username:'Finder'},
{id:3, username:'Eaching'},
];

const filtered = array.filter(element => element.id > 2);
console.log(filtered);

//MAP. Crea un nuevo array con los resultados de la función de cada elemento.
const persons = [
{id:1, username:'Mapper'},
{id:2, username:'Finder'},
{id:3, username:'Eaching'},
];

const fullName = persons.map(person => `id:${person.id}, nombre:${person.username}`);
console.log(fullName);

//FIND. Devuelve el primer elemento que cumpla las condiciones del filtro.
const firstElement = persons.find(person => person.id > 0);
console.log(firstElement);

//FOREACH. Ejecuta una función para cada elemento del array.
// TODO
const array1 = [1,2,3,4,5];
const todo = array1.forEach(element => console.log(element));
   


