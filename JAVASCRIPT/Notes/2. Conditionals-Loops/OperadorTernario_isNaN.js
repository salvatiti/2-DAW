//IF ELSE normal
let miNumero = "18e";
let edad = Number(miNumero);
console.log(edad);

if (isNaN(edad)) {
  console.log(`No es un numero`);
} else {
  if (edad >= 18) {
    console.log(`Puede votar`);
  } else {
    console.log(`Muy joven para votar`);
  }
}

if (isNaN(edad)) {
  console.log("No es un número");
} else {
  //Operador ternario
  let resultado = edad >= 18 ? `Puede votar` : `Muy joven para votar`;
  console.log(resultado);
}
