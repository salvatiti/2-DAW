// variable mundo con atributos
var mundo = {
  nivel: {},
  camara: {
    alto: 500,
    ancho: 700,
  },

  jugador: {
    alto: 40,
    ancho: 20,
    x: 0,
    y: 0,
  },
};

//programa principal
var juego_terminado = false;

setInterval(bucle_principal, 1); //ejecuta cada cierto tiempo la funcion, en milisegundos

function bucle_principal() {
  mundo.jugador.x = mundo.jugador.x + 1; //movimiento del jugador
  console.log(
    " Posicion del jugador:" + mundo.jugador.x + ", " + mundo.jugador.y
  ); 
  //posicion del jugador
  var canvas = document.getElementById("pantalla"); // uniendo html con js
  var ctx = canvas.getContext("2d");
  // primero borramos todo el dibujo
  ctx.fillStyle = "rgb(255,255,255)";
  ctx.fillRect(0, 0, 600, 600); //borramos el dibujo con el color blanco
  //600,600 es el ancho y el alto de la pantalla que hemos puesto en el canvas

  // despues dibujaremos al jugador con el color rojo,
  // el rectangulo blanco va sobreescribiendo el rojo para que parezca que esta en movimiento
  ctx.fillStyle = "rgb(255,0,0)"; //color del rectangulo
  ctx.fillRect( //dibujar el rectangulo en las coordenadas
    mundo.jugador.x,
    mundo.jugador.y,
    mundo.jugador.ancho,
    mundo.jugador.ancho
  );
}
