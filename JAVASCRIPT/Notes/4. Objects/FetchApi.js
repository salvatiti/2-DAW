fetch("https://pokeapi.co/api/v2/pokemon/") //fetch consume una API
  //then() Promesa: esperamos que la url nos devuelva los datos.
  //Un funcion flecha para que devuelva los datos en formato JSON
  .then((res) => res.json())
  //La segunda funcion es para obtener los datos
  .then((datos) => {
    console.log(datos);
  })
  .catch((error) => console.log(error));

//async / await
//await tiene que estar dentro de una funcion async
const obtenerPokemons = async () => {
  try {
    const repuesta = await fetch("https://pokeapi.co/api/v2/pokemon/"); //espera la respuesta del fetch
    const datos = await repuesta.json(); //espera la respuesta del json
    console.log(datos);
  } catch (error) {
    console.log(error);
  }
};
