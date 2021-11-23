function suma(num1, num2) { // Cada vez que llamamos a la funcion creamos dos parametros
   let res = num1 + num2; // Esos parametros los sumamos y los guardamos en la variable res
    return res; // Devolvemos la variable res
}

let resultado = suma(2,4); //La variable resultado guarda el resultado de la funcion suma, con esos dos parametros
console.log(resultado);


/*Se le pasa como parametro la variable nombre, y en la variable mensaje vamos a almacenar lo que se
va a devolver en el return, que va a ser mediante backticks la concatenación de un texto con el 
parámetro que se le pasa a la función */ 
function saludar(nombre) {
    let mensaje = `Hola ${nombre}, como estas?`;
   return mensaje;
}
console.log(saludar('Juan'));


function tablaDelUno(){//Normal
    for(let i = 1; i <= 10; i++){
        console.log(`1 * ${i} = ${i * 1}`);
    }
}
for(i=0;i<3;i++) tablaDelUno();//Ejecutamos la función 3 veces

function tablaDelUno2(hasta){ //Parametros
    for(let i = 1; i <= hasta; i++){
        console.log(`1 * ${i} = ${i * 1}`);
    }
}
tablaDelUno2(3);

// Declaración
function tablaMultiplicar(tabla, hasta) {
    for (i = 0; i <= hasta; i++) console.log(`${tabla} * ${i} = ${tabla * i}`);	
  }
  // Ejecución
  tablaMultiplicar(5,4); // Tabla del 5

// Si queremos que llegue hasta otro número, lo indicamos explicitamente,
// pero si lo omitimos, queremos que llegue hasta 10. 
  function tablaMultiplicar(tabla, hasta = 10) {
    for (i = 0; i <= hasta; i++) console.log(tabla, "x", i, "=", tabla * i);
  }
  // Ejecución
  tablaMultiplicar(2); // Esta tabla llegará hasta el número 10
  tablaMultiplicar(2, 5); // Esta tabla llegará hasta el número 5