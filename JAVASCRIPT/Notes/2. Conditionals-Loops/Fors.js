//declaracion
//inicializar
//iterar (aumento o decremento)

for (let i = 0; i < 10; i++) {
  console.log(i);
}

for (let i = 0; i < 10; i++) {
    if (i==5) break; //detiene el ciclo si i es igual a 5
    console.log(i);
}

let miArray = ["Hola", "Mundo", "Puta", "!"];
for (let i = 0; i < miArray.length; i++) {
   if (i == 2) continue; //Salta el elemento 2
    console.log(miArray[i]);
}
 
//FOR IN/FOR OF
//La variable en cada vuelta del bucle va a ser igual a cada uno de los valores del Array.

//FOR IN → devuelve el indice del array(no devuelve los undefined)
//Se usa para recorrer objetos, obtener sus posiciones y operar on esos objetos.
//Tambien muestra las propiedades de los objetos
let animales = ["Perro", "Gato", "Caballo", "Cabra"];
for (let animal in animales) {
    console.log(animal); 
    //Para que devuelva el valor tendria que ser console.log(animales[animal]);
}

//FOR OF → devuelve el valor del array(devuelve los undefined)
//Se usa para recorrer arrays y obtener sus valores.
for (let animal of animales) {
    console.log(animal);
}