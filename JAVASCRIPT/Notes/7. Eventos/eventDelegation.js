//EVENT DELEGATION
const container = document.querySelector(".container");
const span = document.querySelector("span");
let contador = 0;

container.addEventListener("click", (event) => {
  if (event.target.classList.contains("btn-info") ) { //Si el evento se dispara en el boton de aumentar
    contador++;
    span.textContent = contador;
  } else if (event.target.classList.contains("btn-danger")){ //Si el evento se dispara en el boton de disminuir
    contador--;
    span.textContent = contador;
  }
});



//STOP PROPAGATION
//Cuando detectemos un elemento dento del .container, solo esos elementos podran recibir el evento
const button = document.querySelector(".btn-dark");
const bgsuccess = document.querySelector(".bg-success");

button.addEventListener("click", (ev) => {
    console.log('click boton');
    ev.stopPropagation(); //Detiene la propagacion del evento
    //Si no esta el stopPropagation, el evento se propagaria hasta el bgsucces
    // y se ejecutaria en todos los elementos
})

bgsuccess.addEventListener("click", () => {
    console.log('click bgsuccess');
})