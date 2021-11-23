//Primero se pregunta y despues de ejecuta, siempre pregunta hasta que la condición es falsa
//Mientras que el numero sea menor que 10, se imprimira el numero y se sumara 1
let numero = 0;
while (numero < 10) {
    numero++;
    console.log(numero);
    
}

//Primero se ejeuta y despues se pregunta, siempre se ejecuta al menos UNA VEZ, y luego segun la condicion
//se ejecuta o no
let numero1=0;
do{
    numero1++;
    console.log(numero1);
}
while(numero1<10);


// Con el break podemos detener el ciclo
let numero2=0;
while (numero2<1000){
    numero2++;
    console.log(numero2)
    if (numero2==10)
        break;
}