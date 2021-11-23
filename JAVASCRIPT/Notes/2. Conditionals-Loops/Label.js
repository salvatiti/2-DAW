let array1 = ["Marta", "Pepa", "Roberta"];
let array2 = ["Pedro", "Marcelo", array1, "Juan"];

pararFor: //Label
for(let array in array2){ //Recorre el array2
    if(array == 2){ //Si esta en la posicion 2.
        for(let array of array1){ //Recorremos el array1 que esta en la posicion 2 del array2
            //continue; salta el array1
            console.log(array + " ");
            break pararFor; //Detiene el ciclo cuando esta en la posicion 2
            //si no se pone label, se detiene el ciclo cuando pasa a la posicion 3
        }
    } else{
        console.log(array2[array] + " ");
    }
}