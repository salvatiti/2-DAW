//Definimos e iniciamos las variables necesarias
var y = 0;
var x = 0;
var controlY = 1;
var controlX = 1;
var velocidad = 1;
var velocidadNave = 10;

var z = 0;


// Cada 5 mili-segundos se va a ejecutar la función mover que comprueba
// las colisiones de la pelota
var intervaloNave = setInterval("moverNave()", velocidadNave);
var intervaloMarciano = setInterval("moverMarciano()", 5);

function moverNave() {
  if (z <= 0) {
   z=0;
  } else if (z >= document.getElementById("lienzo").offsetWidth - 100) {
    // Esto significa que si es mayor o igual a el ancho que tiene el lienzo menos el tamaño de la imagen se le da un nuevo valor a x
    z = document.getElementById("lienzo").offsetWidth - 100;
  }
  document.getElementById("nave").style.left = String(z) + "px";
}

//la función mover, que hace el idem con el objeto
function moverMarciano() {
  //Eje de las X
  if (controlX == 1) {
    x += velocidad;
  } else {
    x -= velocidad;
  }
  if (x <= 0) {
    controlX = 1;
    x = 0;
  } else if (x >= document.getElementById("lienzo").offsetWidth - 150) {
    // Esto significa que si es mayor o igual a el ancho que tiene el lienzo menos el tamaño de la imagen se le da un nuevo valor a x
    controlX = 0;
    x = document.getElementById("lienzo").offsetWidth - 150;
  }

  //Eje de las Y
  if (controlY == 1) {
    y += velocidad;
  } else {
    y -= velocidad;
  }
  if (y <= 0) {
    controlY = 1;
    y = 0;
  } else if (y >= document.getElementById("lienzo").offsetHeight - 150) {
    // Esto significa que si es mayor o igual a la altura que tiene el lienzo menos el tamaño de la imagen se le dará un nuevo valor a y
    controlY = 0;
    y = document.getElementById("lienzo").offsetHeight - 150;
  }

  //movemos la imagen en el eje x e y asignando un valor en px
  document.getElementById("marcianos").style.left = String(x) + "px";
  document.getElementById("marcianos").style.top = String(y) + "px";
}

//función que llama a la animación css para girar el objeto
function girar() {
  document.getElementById("imagen").className = "gira";
}

document.addEventListener("keydown", (event) => {
  switch (event.key) {
    case "ArrowLeft":
      z -= velocidadNave;
      break;
    case "ArrowRight":
      z += velocidadNave;
      break;
  }
});
