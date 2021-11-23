//FOR
const notas = [1,4,5,6,7,8,9,10,11];
for (let i = 0; i<notas.length; i++) {
    console.log(`La nota ${i} es  ${notas[i]}`);
}

//Valores indefinidos en el Array
//Hay que poner una condicion de que si las notas no son undefinidas, entonces muestralas.
const notas1 = [5,8,2,,,9,,3]
for(let i = 0; i<notas1.length; i++) {
    if(notas1[i] !== undefined)
    console.log(`La nota ${i} es  ${notas1[i]}`);
}

//FOR IN(Te muestra el indice del Array, no muestra los undefined)
for(let i in notas){
    console.log(`La nota ${i} es ${notas[i]}`);
}

let numeros = [1,4,6,7,9];
for(let i in numeros){
    console.log(i);
}

//FOR OF(Te muestra los valores del Array, muestra los undefined)
for(let i of notas){
    console.log(i);
}

let numeros1 = [1,4,6,7,9];
for(let i of numeros1){
    console.log(i);
}

//Diferencias
let miArray =  [33,55,,77];
for(let i in miArray){
    console.log(i);
}
for(let i of miArray){
    console.log(i);
}