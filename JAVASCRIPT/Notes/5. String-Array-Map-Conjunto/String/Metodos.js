//LocaleCompare (Compara dos cadenas de caracteres, No distingue minusculas y mayusculas).
// Devuelve 1 porque la ñ es mas pequeña en orden alfabético que la o.
let texto1 = "Oso";
let texto2 = "Ñu";
console.log(texto1.localeCompare(texto2));

//Length (Devuelve el tamaño de un texto)
let texto = "Dromedario";
console.log(texto.length);

//CharAt (Extrae un caracter concreto del texto, hay que indicar la posición, empezando por la posición 0)
//charCodeAt(Igual pero devuelve el código del caracter)
console.log(texto.charAt(0));
console.log(texto.charCodeAt(0));

//toUpperCase(de minusculas a mayusculas)
//toLowerCase(de mayusculas a minusculas)
console.log(texto.toUpperCase());
console.log(texto.toLowerCase());

//indexOf(Devuelve la posción del texto indicado en la variable, empezando por la izquierda)
//Si aparece varias veces, devuelve la primera posición en la que aparece
let buscar = "Donde esta la x, busca, busca";
console.log(buscar.indexOf("x"));
//lastIndexOf(Devuelve la ultima posicion donde aparece en el texto)
console.log(buscar.lastIndexOf("e"));

//endWith(Devuelve true si el texto finaliza con el texto que indicamos)
console.log(buscar.endsWith("busca"));
//startWith(Devuelve true si el texto finaliza con el texto que indicamos)
console.log(buscar.startsWith("Donde"));

//replace(Extrae y modifica subcadenas, busca el texto indicado y lo cambia por el segundo texto) 
console.log(buscar.replace("busca","encuentra"));

//trim(Quita los espacios en blanco a la derecha e izquierda del texto)
let espacios = " texto con muchos espacios  ";
console.log("-" + espacios + "-")
console.log("-" + espacios.trim() + "-");

//slice(Extrae del texto los caracteres desde la posicion (inicio) hasta la posicion(fin))
let extraer = "Extraemos el caracter indicado"
console.log(extraer.slice(9,extraer.length));

//split(Pasar la cadena a Array)
let pana = "Hola mi pana";
//si no se pone nada en el parametro pasa la cadena entera a una posicion del array
console.log(pana.split());
//Si se pone comillas en pasa cada letra de la cadena a una posicion distinta del array 
console.log(pana.split(""));
//Si se pone un espacio en blanco pasa cada palabra a una posicion del array
console.log(pana.split(" "));
//Se puede limitar hasta donde queremos que se convierta en Array, delimitando hasta donde queremos que sea
//el Array.(2, las dos primeras palabras)
console.log(pana.split(" ",2));