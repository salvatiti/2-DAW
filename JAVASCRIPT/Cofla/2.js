/*2)Un joven muy afortunado logro ganar el primer premio de la loteria, este hombre decide hacer una fiesta
para festejar que salió e la pobreza. Con este dinero decide comprar una maquina que deja pasar
solamete a los mayores e edad, entre otras cosas...

- Dejar pasar a los mayores de edad.
- La primera persona que entre despues de las 2 AM, no paga.*/

let free = false; //Cuando la primera persona entre, se pasa a true.
const validarCliente = time => {
    let edad = prompt("Ingrese su edad");
    if (edad >= 18) {
        if (time >= 2 && time <7 && !free /*igual a (free == false)*/ ) {
        //si entra despues de las 2 am y antes de las 7 am y free esta false
        alert("Usted no paga");
        free = true;
        }else{
            alert(`Son las ${time}:00Hs. Puedes pasar pero tienes que pagar la entrada`);
        }

    }else{
            alert("Usted no puede entrar");
        }
}

validarCliente(5);
validarCliente(6);
validarCliente(20);